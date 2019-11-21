/**
 * 
 */
package com.eduardogroup.spring.boot.backend.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eduardogroup.spring.boot.backend.apirest.models.entity.Cliente;
import com.eduardogroup.spring.boot.backend.apirest.models.services.IClienteService;

/**
 * @author Eduardo Valeriano S
 *
 */
@RestController
@RequestMapping("/api")
public class ClienteRestController {

	@Autowired private IClienteService clienteService;
	
	@GetMapping("/clientes")
	public List<Cliente> index(){
		return clienteService.findAll();
	}
}
