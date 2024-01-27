package com.generation.ejerciciolvcd;
import java.util.Scanner;
public class MainMangosNaranjas {
	public static void main(String[] args) {
        // Creamos un objeto de la clase Scanner para leer datos por consola
        Scanner sc = new Scanner(System.in);

        // Pedimos el número de mangos y naranjas
        System.out.println("Ingrese el número de mangos:");
        int mangos = sc.nextInt();
        System.out.println("Ingrese el número de naranjas:");
        int naranjas = sc.nextInt();

        // Creamos un objeto de la clase MangosNaranjas con los datos ingresados
        MangosNaranjas mn = new MangosNaranjas(mangos, naranjas);

        // Invocamos el método imprimir del objeto mn
        mn.imprimir();
        
        
    }
}
