package dao;

import java.util.List;

import model.Cliente;

public interface ClienteDao extends GenericDao<Cliente, Long>{
	
	public List<Cliente> findByNome(String nome);
	
}
