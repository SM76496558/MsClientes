package com.api.msclientes.service;

import com.api.msclientes.model.Cliente;

import java.util.List;

public interface IServiceCliente {


  List<Cliente> findAll();

  Cliente save(Cliente clienteBody);
}
