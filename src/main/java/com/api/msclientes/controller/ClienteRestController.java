package com.api.msclientes.controller;

import com.api.msclientes.dto.ClienteDto;
import com.api.msclientes.model.Cliente;
import com.api.msclientes.service.IServiceCliente;
import com.api.msclientes.usecase.ClientesUseCase;
import com.api.msclientes.utils.Constants;
import com.api.msclientes.utils.RequestBodyCustom;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "/clientes", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class ClienteRestController {


  private final ClientesUseCase clientesUseCase;


  @GetMapping
  public ResponseEntity<?> fidnAll() {
    List<Cliente> listaClientes = clientesUseCase.obtenerClientes();
    // Y entonces una vez que obtienes la lista ya validada o no, solo quedaria retornala con el ResponseEntity
    return ResponseEntity.status(HttpStatus.OK).body(listaClientes);
  }

  @PostMapping
  public ResponseEntity<?> save(@Valid @RequestBody ClienteDto clienteDto) {
  
    //Una vez validado el clienteDto se invoca el usecasae
    Cliente clienteGuardado = clientesUseCase.saveCliente(clienteDto);

    return ResponseEntity.status(HttpStatus.OK).body(clienteGuardado);


  }


}
