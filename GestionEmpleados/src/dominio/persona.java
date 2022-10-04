/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author Alumno Mañana
 */
public abstract class persona{
    public String nombre;
    public String apellido;
    private static int cont;
    int id;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public persona() {
        this.id=++persona.cont;
    }

    public persona(String nombre, String apellido) {
        this();
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public final void imprimir(){
        System.out.println("Imprimiendo desde la clase padre: ");
    }

    @Override
    public String toString() {
        return "id=" + id + ", "+ nombre + " " + apellido;
    }

    

    
    
    
    
    
}
