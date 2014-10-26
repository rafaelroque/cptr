package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="tb_dotacao_orcamentaria")
public class DotacaoOrcamentaria extends BaseModel {
	
	@SequenceGenerator(name="dot",allocationSize=1, sequenceName="tb_dotacao_orcamentaria_seq")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="dot")
	@Id
	Long id;
	
	Integer codigo;
	
	Double valor;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	
}
