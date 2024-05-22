package com.api.msclientes.utils;

import lombok.*;

@Data // Con esto no tenemos la necesitad de crear los GETTER AND SETTER
@Builder // Una forma mas practica de poder crear un objeto de esta clase *RequestBodyCustom.builder()
//.message("string")
//.build()*
@RequiredArgsConstructor
// Anotacion para crear un constructor con solo algunos atributos, esta anotacion hace que cuando creemamos un objeto de esta clase
// si solo le pasamos ciertos atributos el resto los coloca en null
@AllArgsConstructor // Anotacion para que exista un constructor con TODOS los atributos
public class RequestBodyCustom {

  private String message;
  private Object object;
  private String otro2;


  public RequestBodyCustom(String message, Object object) {
    this.message = message;
    this.object = object;
  }

  public RequestBodyCustom(String message) {
    this.message = message;

  }

  public RequestBodyCustom(Object object) {


  }



}
