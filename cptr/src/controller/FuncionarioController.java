package controller;

import java.util.List;

import javax.faces.model.SelectItem;

import model.Funcionario;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import dao.FuncionarioDao;

@Component
@Scope("globalSession")
public class FuncionarioController extends GenericController<Funcionario, FuncionarioDao> {


	List<SelectItem> selectItems;
	final static String DAO_CONCRETO = "funcionarioDaoImp";

	public FuncionarioController(){
		injetaDao();
		//filtro = new Cidadao();
	}

	@Override
	public void setaNavegacao() {
		LISTAGEM = "listarFuncionario";
		CADASTRO = "cadastrarFuncionario";

	}

	@Override
	public void injetaDao() {
		try{
			super.dao = (FuncionarioDao) getApplicationContext().getBean(DAO_CONCRETO);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	

	




}

