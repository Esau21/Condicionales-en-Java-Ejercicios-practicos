public class Open {
    public static void main(String args[]) {
        int operacion = 1;
        int num_uno = 8;
        int num_2 = 9;
        int resultado = 0;

        if (operacion == 1) {
            resultado = num_uno + num_2;
            System.out.println("El resultado de la suma es : " + resultado);
        } else if (operacion == 2) {
            resultado = num_uno - num_2;
            System.out.println("El resultado de la resta  es : " + resultado);
        } else if (operacion == 3) {
            resultado = num_uno * num_2;
            System.out.println("El resultado de esta multiplicacion es " + resultado);
        } else if (operacion == 4) {
            resultado = num_uno / num_2;
            System.out.println("El resultado de esta division es " + resultado);
        } else if (operacion == 5) {
            resultado = (num_uno + num_2) / 6;
            System.out.println("El resultado de esta expresion es : " + resultado);
        } else {
            System.out.println("La opcion que escogiste no es valida en este programa.");
        }
    }
}
