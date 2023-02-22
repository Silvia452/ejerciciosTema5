import java.util.Scanner;

public class ejercicio3 {

    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        mediav4();

    }

    public static void mediav4(){
        int[] valores = new int[100]; //creamos un array de 100 valores
        int suma = 0;
        int i = 0; //contador de valores introducidos
        while (true) {
            System.out.println("¿Nota(-1 para terminar)? ");
            valores[i] = sc.nextInt();
            if (valores[i] == -1) { //si el valor introducido es -1, se rompe el bucle
                break;
            }
            suma += valores[i]; //se suma el valor introducido al total
            i++;
        }

        System.out.println("La media aritmética de los valores introducidos " + " es: " + (suma / i));

    }
}
