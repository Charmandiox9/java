import java.util.Scanner;

public class Suma{
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        String nombre = "";
        int num_1 = 0, num_2 = 0, resultado = 0;

        System.out.println("Cuál es tu nombre?");
        nombre = in.nextLine();

        System.out.println("Dame el primer valor:");
        num_1 = in.nextInt();

        System.out.println("Dame el segundo valor:");
        num_2 = in.nextInt();

        resultado = num_1 + num_2;

        System.out.println("Hola "+ nombre + " el resultado de tu suma es: " + resultado);
    }
}