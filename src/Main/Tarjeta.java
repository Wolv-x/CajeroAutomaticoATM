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
        //validar 16 numeros de tarjeta all en la misma seccion-->6to Gabriel
        //*********************************************//
        //validar 3 digitos de la clave all ahi mismo -->7mo Gabriel
        //*********************************************//
        //validar si se ingresa numeros y no texto all ahi mismo -->8vo Nicolas --> /metodo deteccion Dennis
        //*********************************************//
        if(tarjetas.containsKey(numeroTarjeta)){//consultar en BD
            return tarjetas.get(numeroTarjeta).equals(clave);
        }else{
            return false;
        }

    }
    // cambiar contraseña -->9no Nicolas --> contraseña de 3 digitos
    // validar si se ingresa texto-->/Dennis

    //

}
