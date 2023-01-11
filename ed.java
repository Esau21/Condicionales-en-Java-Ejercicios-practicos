import java.util.Scanner;

public class ed {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String nombre = "";
        int operacion = 5;
        int num_1 = 0;
        int num_2 = 0;
        int resultado = 0;

        if (operacion == 1) {
            System.out.println("Dame tu nombre");
            nombre = in.nextLine();
            System.out.println("Dame el primer numero");
            num_1 = in.nextInt();
            System.out.println("Dame el segundo numero");
            num_2 = in.nextInt();

            resultado = num_1 + num_2;
            System.out.println("Hola " + nombre + "El resultado de esta operacion es :" + resultado);
        } else if (operacion == 2) {
            System.out.println("Dime cual es tu nombre");
            nombre = in.nextLine();
            System.out.println("Dame tu primer numero");
            num_1 = in.nextInt();
            System.out.println("Dame tu segundo numero");
            num_2 = in.nextInt();

            resultado = num_1 - num_2;
            System.out.println("Hola : " + nombre + "El resultado de esta operacion es : " + resultado);

        } else if (operacion == 3) {
            System.out.println("Dame tu nombre");
            nombre = in.nextLine();
            System.out.println("Dame tu primer numero");
            num_1 = in.nextInt();
            System.out.println("Dame tu segundo numero");
            num_2 = in.nextInt();

            resultado = num_1 * num_2;
            System.out.println("Hola : " + nombre + "El resultado para esta operacion es : " + resultado);

        } else if (operacion == 4) {
            System.out.println("Dame tu nombre");
            nombre = in.nextLine();
            System.out.println("Dame tu primer numero");
            num_1 = in.nextInt();
            System.out.println("Dame tu segundo numero");
            num_2 = in.nextInt();

            resultado = num_1 / num_2;
            System.out.println("Hola : " + nombre + "El resultado para esta operacion es : " + resultado);

        } else if (operacion == 5) {
            System.out.println("Dame tu nombre");
            nombre = in.nextLine();
            System.out.println("Dame tu primer numero");
            num_1 = in.nextInt();
            System.out.println("Dame tu segundo numero");
            num_2 = in.nextInt();

            resultado = (num_1 + num_2) / 2;
            System.out.println("Hola " + nombre + "El resultado para esta operacion es " + resultado);

        } else {
            System.out.println(
                    "Esta opcion no esta disponible vueleve a cerrar el programa y intenta con una de las opciones disponibles");
        }
    }
}