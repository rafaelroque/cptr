package daoImp;

import model.Funcionario;

import org.springframework.stereotype.Component;

import dao.FuncionarioDao;

@Component
public class FuncionarioDaoImp extends GenericDaoImp<Funcionario,Long>
implements FuncionarioDao{

}
