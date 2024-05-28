package com.api.msclientes.service;

import com.api.msclientes.model.Cliente;

import java.util.List;
import java.util.Optional;

public interface IServiceCliente {


  List<Cliente> findAll();

  Cliente save(Cliente clienteBody);
}
