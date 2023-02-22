import java.util.Scanner;

//Realizar un algoritmo que haga que el usuario introduzca tantas cifras comprendidas entre cero y nueve como desee. Una vez que el usuario ha terminado su serie introduciendo -1, el algoritmo muestra el número de veces que se ha escrito cada dígito.
public class ejercicio2 {
    public static final Scanner sn = new Scanner(System.in);

    public static void main(String[] args) {
        numeros();

    }

    public static void numeros(){
        int[] tabla = new int[10]; // Creo un array de 10 posiciones
        int numero = 0;
        while (numero != -1) {
            System.out.println("Introduce un numero entre 0 y 9");
            numero = sn.nextInt();
            if (numero >= 0 && numero <= 9) {
                tabla[numero] = tabla[numero] + 1;
            }
        }
        for (int i = 0; i < tabla.length; i++) {
            System.out.println("Cantidad de: " + i + " se ha introducido " + tabla[i] + " veces");
        }
    }
}
