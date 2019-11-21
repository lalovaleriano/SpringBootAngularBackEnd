/**
 * 
 */
package com.eduardogroup.spring.boot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.eduardogroup.spring.boot.backend.apirest.models.entity.Cliente;

/**
 * @author Eduardo Valeriano S
 *
 */
public interface IClienteDao extends CrudRepository<Cliente, Long> {

}
