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
public class empleado extends persona{
    
    @Override
    public final void imprimir(){
        System.out.print("Imprimiendo desde la clase padre...");
    }
    
}
