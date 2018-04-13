
package ar.com.educacionit.vehiculos.entidades;
import ar.com.educacionit.base.entidades.Persona;

public class Vendedor extends Persona{
    private int cantAutosVendidos;

    public void setCantAutosVendidos(int cantAutosVendidos) {
        this.cantAutosVendidos = cantAutosVendidos;
    }

    public int getCantAutosVendidos() {
        return cantAutosVendidos;
    }

    public Vendedor(String nombre, String apellido, String numeroDocumento, int cantAutosVendidos){
        super(nombre,apellido,numeroDocumento);
        this.cantAutosVendidos=cantAutosVendidos;
    }

    @Override
    public String toString() {
        return "Auto{" + "nombre=" + getNombre() + ", apellido=" + getApellido() + ", numero de documento=" + getNumeroDocumento() + ", cantidad de autos vendidos=" + cantAutosVendidos + '}';
    }
}
