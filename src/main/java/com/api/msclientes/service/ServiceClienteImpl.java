package com.api.msclientes.service;

import com.api.msclientes.exception.ResourceNotFoundException;
import com.api.msclientes.model.Cliente;
import com.api.msclientes.repository.JpaRepositoryCliente;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class ServiceClienteImpl implements IServiceCliente {


  private final JpaRepositoryCliente jpaRepositoryCliente;

  @Override
  public List<Cliente> findAll() {
    List<Cliente> clientes = null;
    // Aqui podemos hacer una validacion antes de retornar los clientes, por e.j:

    // Podemos validar si la lista que nos da el repository tiene datos o no, en caso no tiene datos podemos retornar lo que deseemos
    // Puede ser una lista vacia, o una lista con un elemento Cliente de puros valores null, etc
    // Lo que retornemos dependera del tipo que especificamos en esta funcion al definirla

    //Estas validaciones son más de buenas practicas, para evitar errores de NullPointer o errores de compilacion

    // Nota: lo ideal seria que aqui pase lo mas limpio posible es decir que aqui se haga el post, put o get con el dato ya validado y trasquilado xd
    // Nota 2: Usualmente en esta capa se valida con try catch si no hay alg{un error al pedir datos a la bd (Excepciones de bd)

    return Optional.ofNullable(clientes).orElseThrow(() -> new ResourceNotFoundException("¡Recurso no encontrado!"));
  }

  @Override
  @Transactional
  public Cliente save(Cliente clienteBody) {
    // Lo mismo aqui, se hace un try catch en caso falle el insert a la bd
    return Optional.of(jpaRepositoryCliente.save(clienteBody)).orElseThrow(() -> new ResourceNotFoundException("aaa"));
  }


}
