package org.iesalandalus.programacion.reyajedrez.modelo;

public class Rey {

    private Posicion posicion;
    private Color color;
    private int totalMovimientos;

    public Rey() {
        color = Color.BLANCO;
        posicion = new Posicion(1,'e');
    }



    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getTotalMovimientos() {
        return totalMovimientos;
    }

    public void setTotalMovimientos(int totalMovimientos) {
        this.totalMovimientos = totalMovimientos;
    }
}
