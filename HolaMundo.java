package seccion1;

import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        var nombre = consola.nextLine();
        System.out.println("Hola "+ nombre);
    }
}
