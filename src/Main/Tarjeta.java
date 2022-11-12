package Main;


import java.util.HashMap;

public class Tarjeta {
    //ArrayList<String> tarjetas;
    //ArrayList<String> claves;
    HashMap<String, String> tarjetas;
    public Tarjeta() {
        tarjetas = new HashMap<>();
        tarjetas.put("4271900557374142", "123");
        tarjetas.put("4716050069748111", "672");
        tarjetas.put("4485305457933389", "345");
        tarjetas.put("4278174463982835", "987");
        tarjetas.put("27", "12");
    }

    //Metodo de consulta con la base de datos
    public boolean validarTarjeta(String numeroTarjeta, String clave) {

        if(tarjetas.containsKey(numeroTarjeta)){//consultar en BD
            return tarjetas.get(numeroTarjeta).equals(clave);
        }else{
            return false;
        }
        //borrar
    }

}
