package com.jbank.projeto.repo;

import org.springframework.data.repository.CrudRepository;

import com.jbank.projeto.model.Cliente;

public interface ClienteRepo extends CrudRepository<Cliente, Integer> {

}
