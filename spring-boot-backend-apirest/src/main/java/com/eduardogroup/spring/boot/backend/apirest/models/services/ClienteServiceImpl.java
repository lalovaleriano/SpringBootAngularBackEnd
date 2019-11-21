/**
 * 
 */
package com.eduardogroup.spring.boot.backend.apirest.models.services;

import java.util.List;

import javax.transaction.Transactional;

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

}
