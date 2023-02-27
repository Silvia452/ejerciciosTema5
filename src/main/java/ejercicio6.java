public class ejercicio6 {

    public static void main(String[] args) {
        ejercicio6metodo1();
        System.out.println("\n");
        ejercicio6metodo2();
        System.out.println("\n");
        ejercicio6metodo3();

    }

    public static void ejercicio6metodo1() {
        final int TAMANO = 3;
        int i, j, val;
        int[][] tab2d = new int[TAMANO][TAMANO];
        val = 1;
        for (j = 0; j < TAMANO; j++) {
            for (i = 0; i < TAMANO; i++) {
                tab2d[j][i] = val;
                val = val + 1;
            }
        }

        for (j = 0; j < TAMANO; j++) {
            for (i = 0; i < TAMANO; i++) {
                System.out.print(tab2d[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void ejercicio6metodo2() {
        final int TAMANO = 4;
        int i, j, val;
        int[][] tab2d = new int[TAMANO][TAMANO];
        val = 1;
        for (j = 0; j < TAMANO; j++) {
            for (i = 0; i < TAMANO; i++) {
                tab2d[j][i] = val;
                val = val + 1;
            }
        }

        //Mostrar la tabla
        for (j = 0; j < TAMANO; j++) {
            for (i = 0; i < TAMANO; i++) {
                System.out.print(tab2d[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void ejercicio6metodo3() {
        final int TAMANO = 4;
        int i, j, val;
        int[][] tab2d = new int[TAMANO][TAMANO];
        val = 0;
        for (j = 0; j < TAMANO; j++) {
            for (i = 0; i < TAMANO; i++) {
                tab2d[j][i] = val;
                val = val + 1;
            }
            val = j+1;
        }

        //Mostrar la tabla
        for (j = 0; j < TAMANO; j++) {
            for (i = 0; i < TAMANO; i++) {
                System.out.print(tab2d[j][i] + " ");
            }
            System.out.println();
        }
    }




}
