package com.api.msclientes.Java.methods;


public class StringMethods {

  {
    // length(): Devuelve la longitud de la cadena.
    String str = "Hola, Mundo!";
    int length = str.length();
    System.out.println("Longitud: " + length); // Salida: Longitud: 12

    // ------------------------------------------------------------------------------------------------------ //

    // charAt(int index): Devuelve el carácter en la posición especificada.
    char ch = str.charAt(1);
    System.out.println("Caracter en la posición 1: " + ch); // Salida: Caracter en la posición 1: o

    // ------------------------------------------------------------------------------------------------------ //

    // substring(int beginIndex): Devuelve una nueva cadena que es una subcadena de la cadena original.
    String subStr = str.substring(7);
    System.out.println("Subcadena desde el índice 7: " + subStr); // Salida: Subcadena desde el índice 7: Mundo!

    // ------------------------------------------------------------------------------------------------------ //

    // substring(int beginIndex, int endIndex): Devuelve una nueva cadena que es una subcadena de la cadena original desde beginIndex hasta endIndex - 1.
    String subStr2 = str.substring(0, 4);
    System.out.println("Subcadena del índice 0 al 4: " + subStr2); // Salida: Subcadena del índice 0 al 4: Hola

    // ------------------------------------------------------------------------------------------------------ //

    // indexOf(String str): Devuelve el índice dentro de esta cadena de la primera aparición de la cadena especificada.
    int index = str.indexOf("Mundo");
    System.out.println("Índice de 'Mundo': " + index); // Salida: Índice de 'Mundo': 6

    // ------------------------------------------------------------------------------------------------------ //

    // lastIndexOf(String str): Devuelve el índice dentro de esta cadena de la última aparición de la cadena especificada.
    String str2 = "Hola, Mundo! Hola de nuevo!";
    int lastIndex = str2.lastIndexOf("Hola");
    System.out.println("Último índice de 'Hola': " + lastIndex); // Salida: Último índice de 'Hola': 14

    // ------------------------------------------------------------------------------------------------------ //

    // toUpperCase(): Devuelve una nueva cadena con todos los caracteres en mayúsculas.
    String upperStr = str.toUpperCase();
    System.out.println("Cadena en mayúsculas: " + upperStr); // Salida: Cadena en mayúsculas: HOLA, MUNDO!

    // ------------------------------------------------------------------------------------------------------ //

    // toLowerCase(): Devuelve una nueva cadena con todos los caracteres en minúsculas.
    String lowerStr = str.toLowerCase();
    System.out.println("Cadena en minúsculas: " + lowerStr); // Salida: Cadena en minúsculas: hola, mundo!

    // ------------------------------------------------------------------------------------------------------ //

    // trim(): Devuelve una copia de la cadena con los espacios en blanco iniciales y finales eliminados.
    String strWithSpaces = "   Hola, Mundo!   ";
    String trimmedStr = strWithSpaces.trim();
    System.out.println("Cadena sin espacios: '" + trimmedStr + "'"); // Salida: Cadena sin espacios: 'Hola, Mundo!'

    // ------------------------------------------------------------------------------------------------------ //

    // replace(char oldChar, char newChar): Devuelve una nueva cadena resultante de reemplazar todas las apariciones de oldChar en esta cadena con newChar.
    String replacedStr = str.replace('o', 'a');
    System.out.println("Cadena reemplazada: " + replacedStr); // Salida: Cadena reemplazada: Hala, Munda!

    // ------------------------------------------------------------------------------------------------------ //

    // equals(Object anObject): Compara esta cadena con el objeto especificado.
    boolean isEqual = str.equals("Hola, Mundo!");
    System.out.println("¿Es igual a 'Hola, Mundo!': " + isEqual); // Salida: ¿Es igual a 'Hola, Mundo!': true

    // ------------------------------------------------------------------------------------------------------ //

    // equalsIgnoreCase(String anotherString): Compara esta cadena con otra cadena, ignorando consideraciones de mayúsculas y minúsculas.
    boolean isEqualIgnoreCase = str.equalsIgnoreCase("hola, mundo!");
    System.out.println("¿Es igual a 'hola, mundo!' (ignorando mayúsculas): " + isEqualIgnoreCase); // Salida: ¿Es igual a 'hola, mundo!' (ignorando mayúsculas): true

    // ------------------------------------------------------------------------------------------------------ //

    // contains(CharSequence s): Devuelve true si y solo si esta cadena contiene la secuencia de valores char especificada.
    boolean contains = str.contains("Mundo");
    System.out.println("¿Contiene 'Mundo'?: " + contains); // Salida: ¿Contiene 'Mundo'?: true

    // ------------------------------------------------------------------------------------------------------ //

    // split(String regex): Divide esta cadena alrededor de coincidencias del patrón especificado.
    String[] parts = str.split(", ");
    for (String part : parts) {
      System.out.println("Parte: " + part);
    }
    // Salida:
    // Parte: Hola
    // Parte: Mundo!
  }

}

