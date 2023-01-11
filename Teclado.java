import java.util.Scanner;

public class Teclado {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String nombre = "";
        int numero_uno = 0, numero_dos = 0, resultado = 0;

        System.out.println("Cual es tu nombre? ");
        nombre = in.nextLine();

        System.out.println("Dame el primer valor de tu suma");
        numero_uno = in.nextInt();

        System.out.println("Dame el segundo resultado de tu suma");
        numero_dos = in.nextInt();

        resultado = numero_uno + numero_dos;
        System.out.println("Hola : " + nombre + "El resultado de esta suma es : " + resultado);
    }
}
