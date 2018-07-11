
package ar.com.educacionit.vehiculos.entidades;
import ar.com.educacionit.base.entidades.Vehiculo;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
public class Auto extends Vehiculo{
    
    private StringProperty marca;
    private StringProperty modelo;
    private StringProperty color;
    private int precio;
    private String equipamiento;
    
    public Auto(){
        this(0,0,0,null,null,null,0,null);
    }
    
    public Auto(int alto, int ancho, int largo,String marca, String modelo, String color,int precio, String equipamiento) {
        super(alto, ancho, largo);
        this.marca = new SimpleStringProperty(marca);
        this.modelo = new SimpleStringProperty(modelo);
        this.color = new SimpleStringProperty(color);
        this.precio=precio;
        this.equipamiento=equipamiento;
    }

    public void setMarca(String marca) {
        this.marca.set(marca);
    }

    public void setModelo(String modelo) {
        this.modelo.set(modelo);
    }

    public void setColor(String color) {
        this.color.set(color);
    }

    public String getMarca() {
        return marca.get();
    }

    public String getModelo() {
        return modelo.get();
    }

    public String getColor() {
        return color.get();
    }

    public String getEquipamiento() {
        return equipamiento;
    }

    public void setEquipamiento(String equipamiento) {
        this.equipamiento = equipamiento;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    public StringProperty modeloProperty(){
        return modelo;
    }
    
    public StringProperty marcaProperty(){
        return marca;
    }
    
}
