package practica;

import java.util.Scanner;

/**
 * Clase para practicar el uso de Scanner en Java.
 */
public class PracticaScanner {

    /**
     * Ejercicio 1: Lee un número entero y muestra si es par o impar.
     */
    public void ejercicio1() {
        System.out.println("Ejercicio 1: Lee un número entero y muestra si es par o impar.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();
        // Completar la implementación aquí.
    }

    /**
     * Ejercicio 2: Lee una cadena de texto y la imprime en mayúsculas.
     */
    public void ejercicio2() {
        System.out.println("Ejercicio 2: Lee una cadena de texto y la imprime en mayúsculas.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una cadena de texto: ");
        String texto = scanner.nextLine();
        // Completar la implementación aquí.
    }

    /**
     * Ejercicio 3: Lee dos números decimales y calcula su suma.
     */
    public void ejercicio3() {
        System.out.println("Ejercicio 3: Lee dos números decimales y calcula su suma.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el primer número decimal: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Introduce el segundo número decimal: ");
        double numero2 = scanner.nextDouble();
        // Completar la implementación aquí.
    }

    /**
     * Ejercicio 4: Lee un nombre y una edad e imprime un mensaje personalizado.
     */
    public void ejercicio4() {
        System.out.println("Ejercicio 4: Lee un nombre y una edad e imprime un mensaje personalizado.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();
        // Completar la implementación aquí.
    }

    /**
     * Ejercicio 5: Lee tres números enteros y muestra cuál es el mayor.
     */
    public void ejercicio5() {
        System.out.println("Ejercicio 5: Lee tres números enteros y muestra cuál es el mayor.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Introduce el segundo número: ");
        int numero2 = scanner.nextInt();
        System.out.print("Introduce el tercer número: ");
        int numero3 = scanner.nextInt();
        // Completar la implementación aquí.
    }

    /**
     * Ejercicio 6: Lee una lista de números enteros hasta que el usuario introduzca un 0 y muestra la suma total.
     */
    public void ejercicio6() {
        System.out.println("Ejercicio 6: Lee números enteros hasta que el usuario introduzca un 0 y muestra la suma total.");
        Scanner scanner = new Scanner(System.in);
        int numero;
        int suma = 0;
        System.out.println("Introduce números enteros. Escribe 0 para finalizar.");
        // Completar la implementación aquí.
    }

    /**
     * Ejercicio 7: Lee un carácter y determina si es una vocal.
     */
    public void ejercicio7() {
        System.out.println("Ejercicio 7: Lee un carácter y determina si es una vocal.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un carácter: ");
        char caracter = scanner.next().charAt(0);
        // Completar la implementación aquí.
    }

    /**
     * Ejercicio 8: Lee un número entero y una cadena, y concatena la cadena con el número.
     */
    public void ejercicio8() {
        System.out.println("Ejercicio 8: Lee un número entero y una cadena, y concatena la cadena con el número.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Introduce una cadena de texto: ");
        String texto = scanner.nextLine();
        // Completar la implementación aquí.
    }

    /**
     * Ejercicio 9: Lee un número decimal y lo redondea al entero más cercano.
     */
    public void ejercicio9() {
        System.out.println("Ejercicio 9: Lee un número decimal y lo redondea al entero más cercano.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número decimal: ");
        double numero = scanner.nextDouble();
        // Completar la implementación aquí.
    }

    /**
     * Ejercicio 10: Lee un número entero y determina si está en un rango específico.
     * El rango se fija entre 10 y 50.
     */
    public void ejercicio10() {
        System.out.println("Ejercicio 10: Lee un número entero y determina si está en un rango específico (10-50).");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();
        // Completar la implementación aquí.
    }
}
