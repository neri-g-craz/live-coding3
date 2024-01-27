package com.generation.ejerciciolvcd;
import java.util.Scanner;

/*
 * 
 *    Paulina Mendoza me dio 5
 *    
 *    Rene pudo comprender lo que se pedía en las instrucciones recibidas y logro resolver el ejercicio, siempre platicando lo que iba haciendo  
 */


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
