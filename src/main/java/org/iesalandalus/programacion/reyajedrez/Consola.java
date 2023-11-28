package org.iesalandalus.programacion.reyajedrez;

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






}

