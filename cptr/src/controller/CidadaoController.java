package controller;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.model.SelectItem;

import model.Cidadao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import util.MessageUtil;
import dao.CidadaoDao;

@Component
@Scope("globalSession")
public class CidadaoController extends GenericController<Cidadao, CidadaoDao> {


	List<SelectItem> selectItems;
	final static String DAO_CONCRETO = "cidadaoDaoImp";

	public CidadaoController(){
		injetaDao();
		filtro = new Cidadao();
	}

	@Override
	public void setaNavegacao() {
		LISTAGEM = "listarCidadaos";
		CADASTRO = "cadastrarCidadao";

	}

	@Override
	public void injetaDao() {
		try{
			super.dao = (CidadaoDao) getApplicationContext().getBean(DAO_CONCRETO);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public void filtrar(){

		trazerTodos = false;
		listagem = dao.findByNome(filtro.getNome());


	}

	@Override
	public String salvar(){
		String retorno = null;
		List<Cidadao> lista = dao.findByCpf(objeto.getCpf());
		if(lista!=null){
			retorno = "";
			MessageUtil.addMessage("CPF já cadastrado", FacesMessage.SEVERITY_ERROR);
		}
		else{
			retorno = super.salvar();
		}

		return retorno;
	}




}

