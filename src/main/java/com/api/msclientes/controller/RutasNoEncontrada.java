package com.api.msclientes.controller;

import com.api.msclientes.exception.PathNotFound;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RutasNoEncontrada {


  @RequestMapping("/**")
  public void manejarRutaNoEncontrada() {
    throw new PathNotFound("¡Ruta no encontrada!");
  }
}
