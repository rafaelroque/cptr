package controller;

import java.util.List;

import javax.faces.model.SelectItem;

import model.Contrato;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import dao.ContratoDao;

@Component
@Scope("globalSession")
public class ContratoController extends GenericController<Contrato, ContratoDao> {


	List<SelectItem> selectItems;
	final static String DAO_CONCRETO = "contratoDaoImp";

	public ContratoController(){
		injetaDao();
		//filtro = new Cidadao();
	}

	@Override
	public void setaNavegacao() {
		LISTAGEM = "listarContrato";
		CADASTRO = "cadastrarContrato";

	}

	@Override
	public void injetaDao() {
		try{
			super.dao = (ContratoDao) getApplicationContext().getBean(DAO_CONCRETO);
		}catch(Exception e){
			e.printStackTrace();
		}
	}








}

