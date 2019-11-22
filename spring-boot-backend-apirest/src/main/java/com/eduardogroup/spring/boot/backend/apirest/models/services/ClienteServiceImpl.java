/**
 * 
 */
package com.eduardogroup.spring.boot.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduardogroup.spring.boot.backend.apirest.models.dao.IClienteDao;
import com.eduardogroup.spring.boot.backend.apirest.models.entity.Cliente;

/**
 * @author Eduardo Valeriano S
 *
 */
@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired IClienteDao clienteDao;
	
	@Override
	public List<Cliente> findAll() {		
		return (List<Cliente>) clienteDao.findAll();
	}


	@Override
	public Cliente findById(Long id) {		
		return clienteDao.findById(id).orElse(null);
	}


	@Override
	public Cliente create(Cliente cli) {		
		return clienteDao.save(cli);
	}


	@Override
	public String update(Long id,Cliente cli) {
		Cliente old = new Cliente();
		old = findById(id);
		
		old.setNombre(cli.getNombre());
		old.setApellido(cli.getApellido());
		old.setEmail(cli.getEmail());
		old.setCreateAt(cli.getCreateAt());
		clienteDao.save(old);
		return "succes";
	}


	@Override
	public void delete(Long id) {
		clienteDao.deleteById(id);
	}
	
	
	

}
