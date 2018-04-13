
package ar.com.educacionit.vehiculos.entidades;
import ar.com.educacionit.base.entidades.Persona;

public class Comprador extends Persona{
    private Double presupuesto;

    public void setPresupuesto(Double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public Double getPresupuesto() {
        return presupuesto;
    }
    public Comprador(String nombre, String apellido, String numeroDocumento, Double presupuesto){
        super(nombre,apellido,numeroDocumento);
        this.presupuesto=presupuesto;
    }

    @Override
    public String toString() {
        return "Auto{" + "nombre=" + getNombre() + ", apellido=" + getApellido() + ", numero de documento=" + getNumeroDocumento() + ", presupuesto=" + presupuesto + '}';
    }
    
}
