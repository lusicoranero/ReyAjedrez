package org.iesalandalus.programacion.reyajedrez.modelo;

import javax.naming.OperationNotSupportedException;

public class Rey {

    private Posicion posicion;
    private Color color;
    private int totalMovimientos=0;

    public Rey() {
        color = Color.BLANCO;
        posicion = new Posicion(1,'e');
    }

    public Rey(Color color){
        if(getColor()==Color.BLANCO){
            posicion.setFila(1);
            posicion.setColumna('e');
        }
        else{
            posicion.setFila(8);
            posicion.setColumna('e');
        }
    }



    public Posicion getPosicion() {
        return posicion;
    }

    private void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public Color getColor() {
        return color;
    }

    private void setColor(Color color) {
        this.color = color;
    }

    public int getTotalMovimientos() {
        return totalMovimientos;
    }

    @Override
    public String toString() {
        return "Rey{" +
                "posicion=" + posicion +
                ", color=" + color +
                '}';
    }

    public void mover (Direccion direccion) throws OperationNotSupportedException {
        if (direccion==null){
            throw new NullPointerException("El valor de la dirección no puede ser nulo");
        }
        switch (direccion) {
            case ESTE:
                if (posicion.getColumna() < 'h') {
                    posicion.setColumna((char) (posicion.getColumna() + 1));
                    totalMovimientos=totalMovimientos+1;
                }
                else
                    try {
                        throw new OperationNotSupportedException("El movimiento no puede ser realizado");
                    } catch (OperationNotSupportedException e) {
                        throw new RuntimeException(e);
                    }
                break;
            case SUR:
                if (posicion.getFila() > 1) {
                    posicion.setFila(posicion.getFila() - 1);
                    totalMovimientos=totalMovimientos+1;
                }
                else
                    try {
                        throw new OperationNotSupportedException("El movimiento no puede ser realizado");
                    } catch (OperationNotSupportedException e) {
                        throw new RuntimeException(e);
                    }
                break;
            case NORTE:
                if (posicion.getFila() < 8) {
                    posicion.setFila(posicion.getFila() + 1);
                    totalMovimientos=totalMovimientos+1;
                }
                else
                    try {
                        throw new OperationNotSupportedException("El movimiento no puede ser realizado");
                    } catch (OperationNotSupportedException e) {
                        throw new RuntimeException(e);
                    }
                break;
            case OESTE:
                if (posicion.getColumna() < 'a') {
                    posicion.setColumna((char) (posicion.getColumna() - 1));
                    totalMovimientos = totalMovimientos + 1;
                }
                else
                    try {
                        throw new OperationNotSupportedException("El movimiento no puede ser realizado");
                    } catch (OperationNotSupportedException e) {
                        throw new RuntimeException(e);
                    }

                break;
            case SURESTE:
                if ((posicion.getColumna() < 'h') && posicion.getFila() > 1) {
                    posicion.setColumna((char) (posicion.getColumna() + 1));
                    posicion.setFila(posicion.getFila() - 1);
                    totalMovimientos=totalMovimientos+1;
                } else
                    try {
                        throw new OperationNotSupportedException("El movimiento no puede ser realizado");
                    } catch (OperationNotSupportedException e) {
                        throw new RuntimeException(e);
                    }
                break;
            case NORESTE:
                if ((posicion.getColumna() < 'h') && posicion.getFila() < 8) {
                    posicion.setColumna((char) (posicion.getColumna() + 1));
                    posicion.setFila(posicion.getFila() + 1);
                    totalMovimientos=totalMovimientos+1;
                } else
                    try {
                        throw new OperationNotSupportedException("El movimiento no puede ser realizado");
                    } catch (OperationNotSupportedException e) {
                        throw new RuntimeException(e);
                    }
                break;
            case NOROESTE:
                if ((posicion.getColumna() < 'a') && posicion.getFila() < 8) {
                    posicion.setColumna((char) (posicion.getColumna() - 1));
                    posicion.setFila(posicion.getFila() + 1);
                    totalMovimientos=totalMovimientos+1;
                } else
                    try {
                        throw new OperationNotSupportedException("El movimiento no puede ser realizado");
                    } catch (OperationNotSupportedException e) {
                        throw new RuntimeException(e);
                    }
                break;
            case SUROESTE:
                if ((posicion.getColumna() < 'a') && posicion.getFila() > 1) {
                    posicion.setColumna((char) (posicion.getColumna() - 1));
                    posicion.setFila(posicion.getFila() - 1);
                    totalMovimientos=totalMovimientos+1;
                } else
                    try {
                        throw new OperationNotSupportedException("El movimiento no puede ser realizado");
                    } catch (OperationNotSupportedException e) {
                        throw new RuntimeException(e);
                    }
                break;

            case ENROQUE_CORTO:
                if ((posicion.getColumna() == 'e') && ((posicion.getFila()==1 || posicion.getFila()==8)) && totalMovimientos==0) {
                    posicion.setColumna((char) (posicion.getColumna() +2));
                    totalMovimientos=totalMovimientos+1;
                } else
                    try {
                        throw new OperationNotSupportedException("El movimiento no puede ser realizado");
                    } catch (OperationNotSupportedException e) {
                        throw new RuntimeException(e);
                    }
                break;

            case ENROQUE_LARGO:
                if ((posicion.getColumna() == 'e') && ((posicion.getFila()==1 || posicion.getFila()==8)) && totalMovimientos==0) {
                    posicion.setColumna((char) (posicion.getColumna() -2));
                    totalMovimientos=totalMovimientos+1;
                } else
                    try {
                        throw new OperationNotSupportedException("El movimiento no puede ser realizado");
                    } catch (OperationNotSupportedException e) {
                        throw new RuntimeException(e);
                    }
                break;
        }



    }




}
