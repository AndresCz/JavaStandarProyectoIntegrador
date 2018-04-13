
package ar.com.educacionit.vehiculos.entidades;
import ar.com.educacionit.base.entidades.Vehiculo;
public class Auto extends Vehiculo{
    
    private String marca;
    private String modelo;
    private String color;
    
    public Auto(String marca, String modelo, String color, int alto, int ancho, int largo) {
        super(alto, ancho, largo);
        
        this.marca= marca;
        this.modelo=modelo;
        this.color= color;
    }

    @Override
    public String toString() {
        return "Auto{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", alto=" + getAlto() + ", ancho=" + getAncho() + ", largo=" + getLargo() + '}';
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }
    
    
}
