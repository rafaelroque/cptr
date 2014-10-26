package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tb_unidade_cptr")
public class UnidadeCptr extends BaseModel{
	
	@SequenceGenerator(name="c",allocationSize=1, sequenceName="tb_unidade_cptr_id_seq")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="c")
	@Id
	Long id;
	
	String nome;
	
	String responsavel;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	
	

}
