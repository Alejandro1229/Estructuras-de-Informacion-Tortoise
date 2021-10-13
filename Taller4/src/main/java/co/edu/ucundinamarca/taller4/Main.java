
package co.edu.ucundinamarca.Taller4;

import org.apache.log4j.Logger;

import java.util.Scanner;


public class Main {

    static Logger log = Logger.getLogger(co.edu.ucundinamarca.Taller4.Dulces.class.getName());

    public static void main(String[] args) {

        Scanner intr = new Scanner(System.in);

        co.edu.ucundinamarca.Taller4.Dulces objetoDulce = new co.edu.ucundinamarca.Taller4.Dulces();

        objetoDulce.imprimirIterando("BombonBum");
        objetoDulce.imprimirIterando("ChocoRamo");
        objetoDulce.imprimirIterando("Barrilete");
        objetoDulce.imprimirIterando("Masmelos");
        objetoDulce.imprimirIterando("Galletas");
        objetoDulce.imprimirIterando("Sparkies");
        objetoDulce.imprimirIterando("Arequipe");
        objetoDulce.imprimirIterando("Chocolate");
        objetoDulce.imprimirIterando("Barrilete");
        objetoDulce.imprimirIterando("Papas");

        objetoDulce.mostrarLista();


        co.edu.ucundinamarca.Taller4.Dulces.imprimirSinIterador("ChocoRamo", 10);


    }

}
