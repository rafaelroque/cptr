package controller;

import model.DotacaoOrcamentaria;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import dao.DotacaoOrcamentariaDao;

@Component
@Scope("globalSession")
public class DotacaoOrcamentariaController extends GenericController<DotacaoOrcamentaria,DotacaoOrcamentariaDao> {

	final static String DAO_CONCRETO = "dotacaoOrcamentariaDaoImp";

	@Override
	public void setaNavegacao() {
		LISTAGEM = "listarDotacaoOrcamentaria";
		CADASTRO = "cadastrarDotacaoOrcamentaria";

	}

	public DotacaoOrcamentariaController(){
		injetaDao();
		//filtro = new Cidadao();
	}

	@Override
	public void injetaDao() {
		try{
			super.dao = (DotacaoOrcamentariaDao) getApplicationContext().getBean(DAO_CONCRETO);
		}catch(Exception e){
			e.printStackTrace();
		}
	}


}
