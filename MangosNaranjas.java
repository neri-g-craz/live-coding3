package com.generation.ejerciciolvcd;

public class MangosNaranjas {
	private int mangos;
    private int naranjas;
	public MangosNaranjas(int mangos, int naranjas) {
		this.mangos = mangos;
		this.naranjas = naranjas;
	}
    
	public int mcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return mcd(b, a % b);
        }
    
	}
    public void imprimir() {
        // Calculamos el máximo común divisor de mangos y naranjas
        int divisor = mcd(mangos, naranjas);

        // Calculamos el número de cajas, que es el mismo que el divisor
        int cajas = divisor;

        // Calculamos el número de mangos por caja, que es el cociente de mangos entre divisor
        int mangosPorCaja = mangos / divisor;

        // Calculamos el número de naranjas por caja, que es el cociente de naranjas entre divisor
        int naranjasPorCaja = naranjas / divisor;

        // Imprimimos los resultados
        System.out.println("El número de cajas es: " + cajas);
        System.out.println("El número de mangos en una caja es: " + mangosPorCaja);
        System.out.println("El número de naranjas en una caja es: " + naranjasPorCaja);
    }
}
    

