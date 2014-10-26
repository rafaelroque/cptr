package controller;

import java.util.List;

import javax.faces.model.SelectItem;

import model.MaterialConsumo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import dao.MaterialConsumoDao;

@Component
@Scope("globalSession")
public class MaterialConsumoController extends GenericController<MaterialConsumo, MaterialConsumoDao> {


	List<SelectItem> selectItems;
	final static String DAO_CONCRETO = "materialConsumoDaoImp";

	public MaterialConsumoController(){
		injetaDao();
		//filtro = new Cidadao();
	}

	@Override
	public void setaNavegacao() {
		LISTAGEM = "listarMaterialConsumo";
		CADASTRO = "cadastrarMaterialConsumo";

	}

	@Override
	public void injetaDao() {
		try{
			super.dao = (MaterialConsumoDao) getApplicationContext().getBean(DAO_CONCRETO);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	

	




}

