//Realizar un algoritmo que permita jugar a los barcos con las siguientes simplificaciones:
//
//Solo hay un jugador.
//
//Solo hay cuatro filas y cuatro columnas.
//
//Solo hay un barco que ocupa una única celda (este espacio se elige al azar).

import java.util.Scanner;

public class ejercicio8 {

    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        microGuerraBarcos();

    }
    public static void microGuerraBarcos(){
        int[][] tablero = new int[4][4];
        int fila = (int) (Math.random() * 4);
        int columna = (int) (Math.random() * 4);
        tablero[fila][columna] = 1;
        int fila2;
        int columna2;
        int cont = 0;
        do {
            System.out.println("Introduce una fila: ");
            fila2 = sc.nextInt();
            System.out.println("Introduce una columna: ");
            columna2 = sc.nextInt();
            if (fila2 == fila && columna2 == columna) {
                System.out.println("Has hundido el barco");
                cont++;
            } else {
                System.out.println("Has fallado");
            }
        } while (cont == 0);

        System.out.println(tablero[fila][columna]);

    }
}
