package Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tarjeta tarjeta = new Tarjeta();
        Cuenta cuenta = new Cuenta();
        Scanner ingreso = new Scanner(System.in);

        System.out.println("Ingrese su número de tarjeta: ");

        String numero = ingreso.next();

        System.out.println("Ingrese su clave: ");

        String clave = ingreso.next();
        if (tarjeta.validarTarjeta(numero, clave)) {
            int opc;
            do {
                System.out.println("\tMENU");
                System.out.println("1. Consultar Saldo");
                System.out.println("2. Salir");
                opc = ingreso.nextInt();


                //validar que no se ingresen letras
                switch (opc) {
                    case 1 -> System.out.println(cuenta.consultarSaldo(numero));
                    case 2 -> System.out.println("\tGracias por usar nuestros servicios");
                    default -> System.out.println("Ingrese una opcion valida");
                }
            } while (opc != 2);
        } else {
            System.out.println("Credenciales erroneas");
            System.out.println("\tGracias por usar nuestros servicios");
        }
    }
    //Substitute algorithm over line 18-37

    //bloqueo de cuenta validacion por validacion
    //
    // .

    //escaner separarlo para que no este en el metodo




}