import java.util.Scanner;

public class ejercicio2 {
    public static final Scanner sn = new Scanner(System.in);

    public static void main(String[] args) {
        numeros();

    }

    public static void numeros(){
        int cuenta0 = 0;
        int cuenta1 = 0;
        int cuenta2 = 0;
        int cuenta3 = 0;
        int cuenta4 = 0;
        int cuenta5 = 0;
        int cuenta6 = 0;
        int cuenta7 = 0;
        int cuenta8 = 0;
        int cuenta9 = 0;

        System.out.println("Indicar un valor comprendido entre 0 y 9 o -1 para terminar:");
        int numero = sn.nextInt();

        for (int i = 0; i<numero; i++){
            System.out.println("Cantidad de:" ,);
            if (numero == 0){
                cuenta0++;
            } else if (numero == 1){
                cuenta1++;
            } else if (numero == 2){
                cuenta2++;
            } else if (numero == 3){
                cuenta3++;
            } else if (numero == 4){
                cuenta4++;
            } else if (numero == 5){
                cuenta5++;
            } else if (numero == 6){
                cuenta6++;
            } else if (numero == 7){
                cuenta7++;
            } else if (numero == 8){
                cuenta8++;
            } else if (numero == 9){
                cuenta9++;
            } else if (numero == -1){
                break;
                System.out.println("Cantidad de 0:", cuenta0);
                System.out.println("Cantidad de 1:", cuenta1);
                System.out.println("Cantidad de 2:", cuenta2);
                System.out.println("Cantidad de 3:", cuenta3);
                System.out.println("Cantidad de 4:", cuenta4);
                System.out.println("Cantidad de 5:", cuenta5);
                System.out.println("Cantidad de 6:", cuenta6);
                System.out.println("Cantidad de 7:", cuenta7);
                System.out.println("Cantidad de 8:", cuenta8);
                System.out.println("Cantidad de 9:", cuenta9);

            }

        }


    }
}
