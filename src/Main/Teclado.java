package Main;

import java.util.Scanner;

public class Teclado {
    private final Scanner ingreso;

    private Teclado() {
        ingreso = new Scanner(System.in);
    }

    public String getEntrada() {
        return ingreso.next();
    }
    public void cerrarTeclado(){
        ingreso.close();
    }
}
