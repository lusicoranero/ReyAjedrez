package org.iesalandalus.programacion.reyajedrez;

import org.iesalandalus.programacion.reyajedrez.modelo.Direccion;
import org.iesalandalus.programacion.reyajedrez.modelo.Rey;

import static org.iesalandalus.programacion.reyajedrez.Consola.*;


public class MainApp {
    public static void main(String[] args) {



    }
    private static void ejecutarOpcion(int opcion){
    elegirOpcionMenu(opcion);
    }

    private static void crearReyDefecto(){
        Rey rey = new Rey();

    }

    private static void mover(Direccion direccion){
        mostrarMenuDirecciones();
        direccion=elegirDireccion();
        mover(direccion);

    }

    private static void mostrarRey(Rey rey){
        rey.toString();
    }
}
