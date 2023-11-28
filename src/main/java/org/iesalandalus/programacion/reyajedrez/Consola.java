package org.iesalandalus.programacion.reyajedrez;
import org.iesalandalus.programacion.reyajedrez.modelo.Color;
import org.iesalandalus.programacion.reyajedrez.modelo.Rey;
import utilidades.Entrada;

import javax.swing.*;

public class Consola{

    private static final Consola consola = new Consola();

    private Consola(){

    }

    private  static void mostrarMenu()
    {
        System.out.println("Tarea 3");
        System.out.println("Elija una opción:");
        System.out.println("1.- Crear un rey por defecto.");
        System.out.println("2.- Crear un rey eligiendo el color.");
        System.out.println("3.- Mover.");
        System.out.println("0.- Salir");
    }
    private static int elegirOpcionMenu()
    {
        int opcion;

        do
        {
            System.out.println("Elige una opción (0-3): ");
            opcion=Entrada.entero();
        }while(opcion<0 || opcion>3);

        return opcion;
    }

    private static Color elegirColor() {
        int opcion = 0;
        do {
            System.out.println("Elige un color:");
            System.out.println("1-Blanco");
            System.out.println("2-Negro");
            opcion = Entrada.entero();
        } while (opcion < 0 || opcion > 3);

        if (opcion == 1) {
            Rey rey = new Rey(Color.BLANCO);
            return Color.BLANCO;
        } else{
            Rey rey = new Rey(Color.NEGRO);
            return Color.NEGRO;
        }

    }






}

