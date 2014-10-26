package controller;

import java.util.List;

import javax.faces.model.SelectItem;

import model.UnidadeCptr;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import dao.UnidadeCptrDao;

@Component
@Scope("globalSession")
public class UnidadeCptrController extends GenericController<UnidadeCptr,UnidadeCptrDao> {


	List<SelectItem> selectItems;
	final static String DAO_CONCRETO = "unidadeCptrDaoImp";

	public UnidadeCptrController(){
		injetaDao();
		//filtro = new Cidadao();
	}

	@Override
	public void setaNavegacao() {
		LISTAGEM = "listarUnidadeCptr";
		CADASTRO = "cadastrarUnidadeCptr";

	}

	@Override
	public void injetaDao() {
		try{
			super.dao = (UnidadeCptrDao) getApplicationContext().getBean(DAO_CONCRETO);
		}catch(Exception e){
			e.printStackTrace();
		}
	}








}

