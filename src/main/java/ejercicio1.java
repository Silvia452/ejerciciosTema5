//EJERCICIO 1
public class ejercicio1 {

    public static void main(String[] args) {
        cuentaAtras();
    }

    public static void cuentaAtras(){
        int[] tabla = new int[10]; // Creo un array de 10 posiciones
        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = 10 - i; // Le asigno los valores del 10 al 0
            System.out.println(tabla[i]);
        }
    }
}
