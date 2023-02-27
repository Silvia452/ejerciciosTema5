//EJERCICIO 7
//Crear una tabla de caracteres bidimensional de tamaño 20×30, en la que se colocan caracteres elegidos al azar. Mostrar la tabla generada.
public class ejercicio7 {

    public static void main(String[] args) {
        matriz();

    }
    public static void matriz(){

        char[][] matriz = new char[20][30]; //creamos la matriz

        for (int i = 0; i < matriz.length; i++) { //rellenamos la matriz con caracteres aleatorios
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (char) (Math.random() * 26 + 'a'); //le damos un valor aleatorio a cada posicion de la matriz
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }
}
