package main;

import examen.ExamenJava;
import practica.*;
import practicaClases.PracticaClases;

public class Main {

    // Instancias de las clases
    static PracticaBucles practicaBucles = new PracticaBucles();
    static PracticaArreglos practicaArreglos = new PracticaArreglos();
    static PracticaClases practicaClases = new PracticaClases();
    static PracticaListas practicaListas = new PracticaListas();
    static ExamenJava examenJava = new ExamenJava();

    public static void main(String[] args) {
        System.out.println("=== Bienvenido al programa de ejercicios ===");
        System.out.println("Se han creado las instancias de las clases necesarias.");
        System.out.println("Usa las instancias para llamar al método que quieras.");
        System.out.println("\nEjemplo:");
        System.out.println("practicaBucles.ejercicio1(); // Llama al ejercicio 1 de bucles");
        System.out.println("practicaArreglos.ejercicio2(new int[]{1, 2, 3, 4, 5}); // Llama al ejercicio 2 de arreglos");
        System.out.println("\nPuedes llamar directamente a los métodos en este archivo.");
    }
}
