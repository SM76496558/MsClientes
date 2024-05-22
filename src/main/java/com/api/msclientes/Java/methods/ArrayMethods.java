package com.api.msclientes.Java.methods;

import java.util.*;

public class ArrayMethods {
  {
    // ArrayList(): Construye un array list vacío.
    ArrayList<String> list = new ArrayList<>();

    // add(E e): Agrega el elemento especificado al final de esta lista.
    list.add("Hola");
    list.add("Mundo");
    list.add("!");

    // get(int index): Devuelve el elemento en la posición especificada en esta lista.
    String element = list.get(1);
    System.out.println("Elemento en el índice 1: " + element); // Salida: Elemento en el índice 1: Mundo

    // set(int index, E element): Reemplaza el elemento en la posición especificada en esta lista con el elemento especificado.
    list.set(2, "Java");
    System.out.println("Lista después de set: " + list); // Salida: Lista después de set: [Hola, Mundo, Java]

    // remove(int index): Elimina el elemento en la posición especificada en esta lista.
    list.remove(2);
    System.out.println("Lista después de remove por índice: " + list); // Salida: Lista después de remove por índice: [Hola, Mundo]

    // remove(Object o): Elimina la primera aparición del elemento especificado de esta lista, si está presente.
    list.remove("Mundo");
    System.out.println("Lista después de remove por objeto: " + list); // Salida: Lista después de remove por objeto: [Hola]

    // size(): Devuelve el número de elementos en esta lista.
    int size = list.size();
    System.out.println("Tamaño de la lista: " + size); // Salida: Tamaño de la lista: 1

    // clear(): Elimina todos los elementos de esta lista.
    list.clear();
    System.out.println("Lista después de clear: " + list); // Salida: Lista después de clear: []

    // isEmpty(): Devuelve true si esta lista no contiene elementos.
    boolean isEmpty = list.isEmpty();
    System.out.println("¿Lista vacía?: " + isEmpty); // Salida: ¿Lista vacía?: true

    // addAll(Collection<? extends E> c): Agrega todos los elementos de la colección especificada a esta lista.
    ArrayList<String> anotherList = new ArrayList<>();
    anotherList.add("Uno");
    anotherList.add("Dos");
    anotherList.add("Tres");
    list.addAll(anotherList);
    System.out.println("Lista después de addAll: " + list); // Salida: Lista después de addAll: [Uno, Dos, Tres]

    // contains(Object o): Devuelve true si esta lista contiene el elemento especificado.
    boolean contains = list.contains("Dos");
    System.out.println("¿Lista contiene 'Dos'?: " + contains); // Salida: ¿Lista contiene 'Dos'?: true

    // indexOf(Object o): Devuelve el índice de la primera aparición del elemento especificado en esta lista, o -1 si esta lista no contiene el elemento.
    int index = list.indexOf("Tres");
    System.out.println("Índice de 'Tres': " + index); // Salida: Índice de 'Tres': 2

    // toArray(): Devuelve un array que contiene todos los elementos de esta lista en el orden adecuado.
    Object[] array = list.toArray();
    System.out.print("Elementos del array: ");
    for (Object obj : array) {
      System.out.print(obj + " ");
    }
    // Salida: Elementos del array: Uno Dos Tres
  }
}


