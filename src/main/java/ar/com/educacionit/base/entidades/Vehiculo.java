
package ar.com.educacionit.base.entidades;

public abstract class Vehiculo {
    
    static int velocidadMaxima=150;
    private int alto;
    private int ancho;
    private int largo;

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }
    
    public int getAlto() {
        return alto;
    }

    public int getAncho() {
        return ancho;
    }

    public int getLargo() {
        return largo;
    }
    
    public Vehiculo(int alto,int ancho, int largo){
        this.alto=alto;
        this.ancho=ancho;
        this.largo=largo;
    }
}
