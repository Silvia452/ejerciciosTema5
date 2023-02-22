import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        maquinaVotar();

    }

    public static void maquinaVotar(){
        Scanner sn = new Scanner(System.in);
        int votos[] = new int[4];
        System.out.println("Elija entre:\n" +
                "1 - Emilia TERREROS\n" +
                "2 - Gerardo ESCODAR\n" +
                "3 - María AGUAVIVA\n" +
                "4 - Nadia LETUX");

        int voto = sn.nextInt();

        while (voto != 68753421){
            System.out.println("Elija entre:\n" +
                    "1 - Emilia TERREROS\n" +
                    "2 - Gerardo ESCODAR\n" +
                    "3 - María AGUAVIVA\n" +
                    "4 - Nadia LETUX");
        }
        if (voto ==1) {
            votos[0]++;
        }
        else if (voto ==2) {
            votos[1]++;
        }
        else if (voto ==3) {
            votos[2]++;
        }
        else if (voto ==4) {
            votos[3]++;
        }
        else if (voto ==68753421) {
            System.out.println("Resultados:\n" +
                    "1 - Emilia TERREROS:\n" + votos[0] +
                    "2 - Gerardo ESCODAR\n" + votos[1] +
                    "3 - María AGUAVIVA\n" + votos[2] +
                    "4 - Nadia LETUX" + votos[3]);
        }




    }

}
