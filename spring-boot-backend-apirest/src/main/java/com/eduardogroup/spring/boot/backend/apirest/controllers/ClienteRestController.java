/**
 * 
 */
package com.eduardogroup.spring.boot.backend.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping("/clientes/{id}")
	public Cliente findById(@PathVariable Long  id) {
		return clienteService.findById(id);
	}
	
	@PostMapping("/clientes")
	public Cliente create (@RequestBody Cliente cli ) {
		return clienteService.create(cli);
	}
	
	@PutMapping("/clientes/{id}/{cli}")
	public String upDate(@PathVariable Long id,@RequestBody Cliente cli) {		
		return clienteService.update(id,cli);
	
	}
	@DeleteMapping("/clientes/{id}")
	public void delete(@PathVariable Long id) {
		clienteService.findById(id);
	}
	
}
