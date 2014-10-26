package controller;

import java.util.List;

import javax.faces.model.SelectItem;

import model.MaterialPermanente;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import dao.MaterialPermanenteDao;

@Component
@Scope("globalSession")
public class MaterialPermanenteController extends GenericController<MaterialPermanente, MaterialPermanenteDao> {


	List<SelectItem> selectItems;
	final static String DAO_CONCRETO = "materialPermanenteDaoImp";

	public MaterialPermanenteController(){
		injetaDao();
		//filtro = new Cidadao();
	}

	@Override
	public void setaNavegacao() {
		LISTAGEM = "listarMaterialPermanente";
		CADASTRO = "cadastrarMaterialPermanente";

	}

	@Override
	public void injetaDao() {
		try{
			super.dao = (MaterialPermanenteDao) getApplicationContext().getBean(DAO_CONCRETO);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	

	




}

