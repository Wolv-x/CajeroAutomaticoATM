package Main;

import java.util.HashMap;

public class Cuenta {
    HashMap<String, Float> cuenta;
    public Cuenta() {
        cuenta = new HashMap<>();
        cuenta.put("4271900557374142", 27.2F);
        cuenta.put("4716050069748111", 2.2F);
        cuenta.put("4485305457933389", 7.2F);
        cuenta.put("4278174463982835", 0.2F);
        cuenta.put("27", 300.2F);
    }
    public float consultarSaldo(String numeroTarjeta){
        return cuenta.get(numeroTarjeta);
    }
}
