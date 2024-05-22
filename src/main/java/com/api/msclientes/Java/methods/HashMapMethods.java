package com.api.msclientes.Java.methods;

import java.util.*;

public class HashMapMethods {

  {
    // HashMap(): Construye un hash map vacío.
    Map<String, Integer> map = new HashMap<>();

    // put(K key, V value): Asocia el valor especificado con la clave especificada en este mapa.
    map.put("Uno", 1);
    map.put("Dos", 2);
    map.put("Tres", 3);
    System.out.println("Mapa después de put: " + map); // Salida: Mapa después de put: {Uno=1, Dos=2, Tres=3}

    // get(Object key): Devuelve el valor al que está mapeada la clave especificada, o null si este mapa no contiene ninguna asignación para la clave.
    int value = map.get("Dos");
    System.out.println("Valor para la clave 'Dos': " + value); // Salida: Valor para la clave 'Dos': 2

    // remove(Object key): Elimina la asignación para una clave si está presente en este mapa.
    map.remove("Tres");
    System.out.println("Mapa después de remove: " + map); // Salida: Mapa después de remove: {Uno=1, Dos=2}

    // containsKey(Object key): Devuelve true si este mapa contiene una asignación para la clave especificada.
    boolean containsKey = map.containsKey("Uno");
    System.out.println("¿Mapa contiene la clave 'Uno'?: " + containsKey); // Salida: ¿Mapa contiene la clave 'Uno'?: true

    // containsValue(Object value): Devuelve true si este mapa asigna una o más claves al valor especificado.
    boolean containsValue = map.containsValue(2);
    System.out.println("¿Mapa contiene el valor '2'?: " + containsValue); // Salida: ¿Mapa contiene el valor '2'?: true

    // size(): Devuelve el número de asignaciones de clave-valor en este mapa.
    int size = map.size();
    System.out.println("Tamaño del mapa: " + size); // Salida: Tamaño del mapa: 2

    // isEmpty(): Devuelve true si este mapa no contiene asignaciones de clave-valor.
    boolean isEmpty = map.isEmpty();
    System.out.println("¿Mapa está vacío?: " + isEmpty); // Salida: ¿Mapa está vacío?: false

    // clear(): Elimina todas las asignaciones de este mapa.
    map.clear();
    System.out.println("Mapa después de clear: " + map); // Salida: Mapa después de clear: {}

    // putAll(Map<? extends K, ? extends V> m): Copia todas las asignaciones de la mapa especificada a este mapa.
    Map<String, Integer> anotherMap = new HashMap<>();
    anotherMap.put("Cuatro", 4);
    anotherMap.put("Cinco", 5);
    map.putAll(anotherMap);
    System.out.println("Mapa después de putAll: " + map); // Salida: Mapa después de putAll: {Cuatro=4, Cinco=5}

    // keySet(): Devuelve un conjunto de claves contenidas en este mapa.
    System.out.println("Conjunto de claves: " + map.keySet()); // Salida: Conjunto de claves: [Cuatro, Cinco]

    // values(): Devuelve una colección de valores contenidos en este mapa.
    System.out.println("Colección de valores: " + map.values()); // Salida: Colección de valores: [4, 5]

    // entrySet(): Devuelve un conjunto de vistas de las asignaciones contenidas en este mapa.
    System.out.println("Conjunto de vistas de las asignaciones: " + map.entrySet()); // Salida: Conjunto de vistas de las asignaciones: [Cuatro=4, Cinco=5]

    // replace(K key, V value): Reemplaza la asignación de la clave especificada solo si está actualmente asignada a algún valor.
    map.replace("Cuatro", 40);
    System.out.println("Mapa después de replace: " + map); // Salida: Mapa después de replace: {Cuatro=40, Cinco=5}

    // getOrDefault(Object key, V defaultValue): Devuelve el valor al que está mapeada la clave especificada, o defaultValue si este mapa no contiene ninguna asignación para la clave.
    int defaultValue = map.getOrDefault("Seis", 6);
    System.out.println("Valor para la clave 'Seis' (o valor por defecto): " + defaultValue); // Salida: Valor para la clave 'Seis' (o valor por defecto): 6
  }
}
