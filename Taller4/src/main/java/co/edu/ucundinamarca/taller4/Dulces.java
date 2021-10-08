package co.edu.ucundinamarca.taller4;


import java.util.ArrayList;

public class Dulces {

    public static void main (String[] args){

        ArrayList<String>cadenas;

        cadenas = new ArrayList<String>();

        cadenas.add("ChocoRamo");
        cadenas.add("Frunas");
        cadenas.add("SuperCoco");

        //recorrer ArrayList

        for (int i = 0; i <cadenas.size(); i++){
            System.out.println("->"+cadenas.get(i));
        }

        /*
        cadenas.remove(i); //Eliminar Elementos

        for (int i = 0; i <cadenas.size(); i++){
            System.out.println("->"+cadenas.get(i));
        }
        */


    }


}
