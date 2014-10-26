package daoImp;

import model.Contrato;

import org.springframework.stereotype.Component;

import dao.ContratoDao;

@Component
public class ContratoDaoImp extends GenericDaoImp<Contrato,Long>
implements ContratoDao{

}
