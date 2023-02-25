import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio4 {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        maquinaVotar();

    }

    public static void maquinaVotar() throws InputMismatchException {
        int numero;
        boolean salir = false;

        double emi = 0;
        double ger = 0;
        double mar = 0;
        double nad = 0;
        double cont = 0;

        do {
            System.out.println("Elija entre: ");
            System.out.println("1.- Emilia TERREROS");
            System.out.println("2.- Gerardo ESCODAR");
            System.out.println("3.- María AGUAVIVA");
            System.out.println("4.- Nadia LETUX");
            numero = sc.nextInt();
            cont++;
            try {
                switch (numero) {
                    case 1:
                        emi++;
                        System.out.println("Ha votado");
                        break;
                    case 2:
                        ger++;
                        System.out.println("Ha votado");
                        break;
                    case 3:
                        mar++;
                        System.out.println("Ha votado");
                        break;
                    case 4:
                        nad++;
                        System.out.println("Ha votado");
                        break;
                    case 68753421:
                        salir = true;
                        cont -= 1;
                        break;
                }
            } catch (Exception e) {
                System.out.println("Voto nulo");
            }

        } while (!salir);

        System.out.println("Resultados: ");

        double emilia = Math.round((emi / cont * 100) * 100.0) / 100.0;
        double gerardo = Math.round((ger / cont * 100) * 100.0) / 100.0;
        double maria = Math.round((mar / cont * 100) * 100.0) / 100.0;
        double nadia = Math.round((nad / cont * 100) * 100.0) / 100.0;
        System.out.println("Emilia TERREROS: " + emilia + " %");
        System.out.println("Gerardo ESCODAR: " + gerardo + " %");
        System.out.println("María AGUAVIVA: " + maria + " %");
        System.out.println("Nadia LETUX: " + nadia + " %");

    }
}
