package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tb_cliente")
public class Cliente extends BaseModel {

	@SequenceGenerator(name="c",allocationSize=1, sequenceName="tb_cliente_id_seq")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="c")
	@Id
	Long id;
	
	String nome;

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

	
	
}
	
