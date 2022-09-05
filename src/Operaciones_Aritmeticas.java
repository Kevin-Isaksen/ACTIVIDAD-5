import java.util.Scanner;

public class Operaciones_Aritmeticas {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        float X;
        System.out.println("Ingrese valor a la variable X");
        X = entrada.nextFloat();
        float Y;
        System.out.println("Ingrese valor a la variable Y");
        Y = entrada.nextFloat();
        float suma = X + Y;
        float resta = X - Y;
        float multiplicacion = X * Y;
        float division = X / Y;
        float modulo = X % Y;
        System.out.println("X = " + X);
        System.out.println("Y = " + Y);;
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Módulo: " + modulo);
    }
}