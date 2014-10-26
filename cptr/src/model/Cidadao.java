package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tb_cidadao")
public class Cidadao extends BaseModel {

	@SequenceGenerator(name="cid",allocationSize=1, sequenceName="tb_cidadao_id_seq")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="cid")
	@Id
	Long id;
	
	String nome;
	
	String cpf;

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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
}
