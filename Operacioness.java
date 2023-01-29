public class Operacioness{
    public static void main(String args[]) {

        int operacion =  4;
        int num_1 = 8;
        int num_2 = 4;
        int resultado = 0;

        if(operacion == 1) {
            resultado = num_1 + num_2;
            System.out.println("El resultado de la suma es: "+ resultado);
        } else if(operacion == 2) {
            resultado = num_1 - num_2;
            System.out.println("El resultado de la resta es: "+ resultado);
        } else if(operacion == 3) {
            resultado = num_1 * num_2;
            System.out.println("El resultado de la multiplicación es: "+ resultado);
        } else if(operacion == 4) {
            resultado = num_1 / num_2;
            System.out.println("El resultado de la división es: "+ resultado);
        } else {
            System.out.println("La opción no es válida");
        }
    }
}