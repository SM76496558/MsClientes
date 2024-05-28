package com.api.msclientes.controller;

import com.api.msclientes.utils.RequestBodyCustom;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping(path = "/rest", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class CustomRestController {


  // ---------------------------------------------------------------------------------------------------------------- //
  @PostMapping(path = "/custom")
  public ResponseEntity<?> custom(@RequestBody RequestBodyCustom requestBodyCustom) {


    // Request personalizado para recibir cualquier parametro desde el postman
    // Creamos con el tipo de dato OBJECT para que se adapte a lo que sea que le enviemos
    String message = requestBodyCustom.getMessage();
    Object object = requestBodyCustom.getObject();


    // Un HasMap que sera lo que retornemos en la respuesta, colocamos como la key un strign cualquiera
    // y en el value aosciado a esa key colocamos el mensaje que tenemos del postman
    // lo mismo con el la key body, la asociamos con su value object que tenemos desde el postman
    HashMap<String, Object> response = new HashMap<>();
    response.put("message", message);
    response.put("body", object);
    return ResponseEntity.status(HttpStatus.CREATED).body(response);
  }

  // ---------------------------------------------------------------------------------------------------------------- //


}
