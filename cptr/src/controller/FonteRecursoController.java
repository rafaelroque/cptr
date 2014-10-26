package controller;

import model.FonteRecurso;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import dao.FonteRecursoDao;

@Component
@Scope("globalSession")
public class FonteRecursoController extends GenericController<FonteRecurso,FonteRecursoDao> {
	
	final static String DAO_CONCRETO = "fonteRecursoDaoImp";
	
	@Override
	public void setaNavegacao() {
		LISTAGEM = "listarFonteRecurso";
		CADASTRO = "cadastrarFonteRecurso";

	}
	
	public FonteRecursoController(){
		injetaDao();
		//filtro = new Cidadao();
	}

	@Override
	public void injetaDao() {
		try{
			super.dao = (FonteRecursoDao) getApplicationContext().getBean(DAO_CONCRETO);
		}catch(Exception e){
			e.printStackTrace();
		}
	}


}
