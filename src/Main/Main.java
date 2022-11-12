package Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Scanner ingreso = new Scanner(System.in);

        System.out.println("Ingrese su número de tarjeta: ");

        String numero = ingreso.next();

        System.out.println("Ingrese su clave: ");

        int clave = ingreso.nextInt();

        int opc;
        do {
            System.out.println("\tMENU");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Salir");
            opc = ingreso.nextInt();
            switch (opc) {
                case 1:

                    break;
                case 2:
                    System.out.println("\tGracias por usar nuestros servicios");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
        } while (opc != 2);
    }
}