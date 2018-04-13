/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.educacionit.base.entidades;

/**
 *
 * @author andres
 */
public abstract class Persona {
    
    private String nombre;
    private String apellido;
    private String numeroDocumento;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }
    
    public Persona(String nombre, String apellido, String numeroDocumento){
        this.nombre=nombre;
        this.apellido=apellido;
        this.numeroDocumento=numeroDocumento;
    }
    
    
}
