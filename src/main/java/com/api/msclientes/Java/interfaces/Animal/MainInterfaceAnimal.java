package com.api.msclientes.Java.interfaces.Animal;

public class MainInterfaceAnimal {
  {
    // Crear una instancia de Perro
    Animal perro = new Perro();
    // Llamar al método hacerSonido() de la interfaz Animal para el perro
    perro.hacerSonido(); // Salida: El perro ladra: ¡Guau!

    // Crear una instancia de Gato
    Animal gato = new Gato();
    // Llamar al método hacerSonido() de la interfaz Animal para el gato
    gato.hacerSonido(); // Salida: El gato maulla: ¡Miau!
  }
}
