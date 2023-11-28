package org.iesalandalus.programacion.reyajedrez;
import org.iesalandalus.programacion.reyajedrez.modelo.Color;
import org.iesalandalus.programacion.reyajedrez.modelo.Direccion;
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

    private static void mostrarMenuDirecciones() {
        System.out.println("Elija una dirección:");
        System.out.println("1.- NORTE");
        System.out.println("2.- NORESTE");
        System.out.println("3.- ESTE.");
        System.out.println("4.- SURESTE");
        System.out.println("5.- SUR");
        System.out.println("6.- SUROESTE");
        System.out.println("7.- OESTE");
        System.out.println("8.- NOROESTE");
    }

    private static Direccion elegirDireccion(){
        int opcion=0;
        Direccion direccion = null;

        do
        {
            System.out.println("Elige una opción (1-8): ");
            opcion=Entrada.entero();
        }while(opcion<1 || opcion>8);

        switch(opcion)
        {
            case 1:
                return direccion.NORTE;
            case 2:
                return direccion.NORESTE;
            case 3:
                return direccion.ESTE;
            case 4:
                return direccion.SURESTE;
            case 5:
                return direccion.SUR;
            case 6:
                return direccion.SUROESTE;
            case 7:
                return direccion.OESTE;
            case 8:
                return direccion.NOROESTE;

            default:
                break;
        }

      return direccion;

    }







}

