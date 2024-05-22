package com.api.msclientes.dto;


import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class ClienteDto {


  // La razón por la cual se crea un DTO es para poder separar
  // entre lo que es el modelo/entidad de la bd con el request que nos envian desde el front o postman

  private String id;

  @NotEmpty(message = "El nombre es requerido")
  @Size(min = 2, max = 100, message = "La cantidad minima de caracteres es de 2")
  private String name;
  private String lastname;
  private Integer age;

  private String email;


  // En los DTOs tenemos la libertad absoluta de poder crearle atributos como deseemos
  // sin la necesidad de modificar nuestra entidad Cliente, ya que esta clase no esta relacionada a la bd y solo sirve
  // de puente para poder mapearle los atributos a la entidad Cliente

}
