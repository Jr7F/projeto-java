package com.jbank.projeto.repo;

import org.springframework.data.repository.CrudRepository;

import com.jbank.projeto.model.Conta;

public interface ContaRepo extends CrudRepository<Conta, Integer>{

}
