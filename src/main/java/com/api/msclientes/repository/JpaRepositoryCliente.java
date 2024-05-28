package com.api.msclientes.repository;

import com.api.msclientes.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;


@Repository
public interface JpaRepositoryCliente extends JpaRepository<Cliente, String> {


  // QUERYS NATIVOS
}
