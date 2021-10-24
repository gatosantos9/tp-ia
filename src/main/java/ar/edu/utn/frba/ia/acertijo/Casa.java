package main.java.ar.edu.utn.frba.ia.acertijo;

import main.java.ar.edu.utn.frba.ia.ag.UTgeNesUtils;

public class Casa {
    String color;
    String nacionalidad;
    String cigarro;
    String bebida;
    String mascota;

    String colores [] = {"Amarillo","Azul","Rojo","Verde","Blanco"};
    String nacionalidades [] = {"Britanico","Sueco","Danes","Noruego","Aleman"};
    String cigarros [] = {"Prince","Pall Mall","Dunhull","Blends","Bluemaster"};
    String bebidas [] = {"Te","Cafe","Leche","Cerveza","Agua"};
    String mascotas [] = {"Perro","Pajaros","Gato","Caballo","Pez"};

    public static Casa generarCasa(){
        Casa unaCasa = new Casa ();

        unaCasa.color = (String) UTgeNesUtils.alguno(unaCasa.colores);
        unaCasa.nacionalidad = (String) UTgeNesUtils.alguno(unaCasa.nacionalidades);
        unaCasa.cigarro = (String) UTgeNesUtils.alguno(unaCasa.cigarros);
        unaCasa.bebida = (String) UTgeNesUtils.alguno(unaCasa.bebidas);
        unaCasa.mascota = (String) UTgeNesUtils.alguno(unaCasa.mascotas);

        return unaCasa;
    }

    public static Casa generarCasa(String coloresDisponibles[],String nacionalidadesDisponibles[],String cigarrosDisponibles[],
                                   String bebidasDisponibles[],String mascotasDisponibles[]){
        Casa unaCasa = new Casa ();

        unaCasa.color = (String) UTgeNesUtils.alguno(coloresDisponibles);
        unaCasa.nacionalidad = (String) UTgeNesUtils.alguno(nacionalidadesDisponibles);
        unaCasa.cigarro = (String) UTgeNesUtils.alguno(cigarrosDisponibles);
        unaCasa.bebida = (String) UTgeNesUtils.alguno(bebidasDisponibles);
        unaCasa.mascota = (String) UTgeNesUtils.alguno(mascotasDisponibles);

        return unaCasa;
    }

    public String getColor() {
        return color;
    }

    public boolean equalsCasa(Casa otraCasa){
        if(this.color.equalsIgnoreCase(otraCasa.getColor())){
            return true;
        }
        return false;
    }
}
