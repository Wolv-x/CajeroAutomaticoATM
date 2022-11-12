package Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Scanner ingreso = new Scanner (System.in);

        System.out.println("Ingrese su número de tarjeta: ");

        String numero = ingreso.next();

        System.out.println("Ingrese su clave: ");

        int clave = ingreso.nextInt();

    }
}