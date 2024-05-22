package com.api.msclientes.utils;

import com.api.msclientes.dto.ClienteDto;
import com.api.msclientes.model.Cliente;

import java.util.UUID;

public class DtoToModel {


  // Al definir un metodo como static nos permite al igual que con las constantes, poder invocarlas
  // sin tener que instanciar una variable de esta clase

  // Este metodo sirve para mapear de un dto a un model
  public static Cliente toModelCliente(ClienteDto clienteDto) {

    String id = UUID.randomUUID().toString().substring(0, 10); // Generamos el id mediante el randomUUID
    String name = clienteDto.getName();
    String lastname = clienteDto.getLastname();
    int age = clienteDto.getAge();


    // Es similar a realizar el setteo de datos
    return Cliente.builder()
            .id(id)
            .name(name)
            .lastname(lastname)
            .age(age)
            .build();
  }

  // Otros mapeos....


}
