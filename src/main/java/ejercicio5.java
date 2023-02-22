import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        palindromo();

    }

    public static void palindromo() {
        Scanner sn = new Scanner(System.in);
        System.out.print("Escriba una palabra y después #: ");
        String input = sn.nextLine();

        // Eliminar el carácter de finalización
        String word = input.substring(0, input.length() - 1);

        boolean isPalindrome = true;
        int length = word.length(); // Longitud de la palabra
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) { // Comparamos los caracteres de los extremos
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println(word + " es un palíndromo");
        } else {
            System.out.println(word + " no es un palíndromo");
        }


    }
}

