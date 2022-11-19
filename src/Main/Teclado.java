package Main;

import java.util.Scanner;
public class Teclado {
    Scanner ingreso;
    public Teclado() {
        ingreso = new Scanner(System.in);
    }
    public String getEntrada() {
        return ingreso.next();
    }
    public void cerrarTeclado(){
        ingreso.close();
    }
    public static boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            System.out.println("INGRESE SOLO NÚMEROS, CERRANDO EL PROGRAMA.....");
            System.exit(0);
            return false;
        }
    }
}
