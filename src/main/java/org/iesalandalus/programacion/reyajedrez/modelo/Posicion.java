package org.iesalandalus.programacion.reyajedrez.modelo;

import java.util.Objects;

public class Posicion {

    private int fila;
    private char columna;

    public Posicion(int fila, char columna) {
        if (fila < 1) {
            throw new IllegalArgumentException("El valor de la fila no puede ser inferior a 1.");
        } else if (fila > 8) {
            throw new IllegalArgumentException("El valor de la fila no puede ser mayor que 8.");
        }
        this.fila = fila;
        if (columna <'a') {
            throw new IllegalArgumentException("El valor de la columna no puede ser inferior a a.");
        } else if (columna >'h') {
            throw new IllegalArgumentException("El valor de la fila no puede ser mayor que h.");
        }
        this.columna = columna;
    }

    public Posicion(Posicion posicion) {
        fila = posicion.fila;
        columna=posicion.columna;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        if (fila < 1) {
            throw new IllegalArgumentException("El valor de la fila no puede ser inferior a 1.");
        } else if (fila > 8) {
            throw new IllegalArgumentException("El valor de la fila no puede ser mayor que 8.");
        }
        this.fila = fila;
    }

    public char getColumna() {
        return columna;
    }

    public void setColumna(char columna) {
        if (columna <'a') {
            throw new IllegalArgumentException("El valor de la columna no puede ser inferior a a.");
        } else if (columna >'h') {
            throw new IllegalArgumentException("El valor de la fila no puede ser mayor que h.");
        }
        this.columna = columna;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Posicion posicion = (Posicion) o;
        return fila == posicion.fila && columna == posicion.columna;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fila, columna);
    }
}
