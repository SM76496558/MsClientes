package com.api.msclientes.model;


import jakarta.persistence.*;
import lombok.*;

@Data
@Builder(toBuilder = true)
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "clientes")
public class Cliente {

  @Id
  private String id;

  @Column
  private String name;

  @Column
  private String lastname;

  @Column
  private Integer age;

}