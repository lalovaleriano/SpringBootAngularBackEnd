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
}
