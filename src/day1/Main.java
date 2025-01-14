package day1;

public class Main {
    public static void main(String[] args) {


        int numero = 12321;

        if (esPalindromo(numero)) {
            System.out.println("El número " + numero + " es un palíndromo.");
        } else {
            System.out.println("El número " + numero + " no es un palíndromo.");
        }
    }

    public static boolean esPalindromo(int numero) {
        // Convertir el número a cadena para poder compararlo
        String numeroStr = Integer.toString(numero);

        // Comparar la cadena con su reverso
        String reversoStr = new StringBuilder(numeroStr).reverse().toString();

        return numeroStr.equals(reversoStr);
    }
}

