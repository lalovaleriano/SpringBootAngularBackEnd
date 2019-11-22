/**
 * 
 */
package com.eduardogroup.spring.boot.backend.apirest.models.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.eduardogroup.spring.boot.backend.apirest.models.entity.Cliente;

/**
 * @author Eduardo Valeriano S
 *
 */
@Service
public interface IClienteService {

	public List<Cliente> findAll();
	public Cliente findById(Long id);
	public Cliente create(Cliente cli);
	public String update(Long id,Cliente cli);
	
	public void delete(Long id);
}
