/*
Crear una clase hija empleado de persona y crear otro dato como numero de Seguridad Social
 */
package principal;

import dominio.persona;

/**
 *
 * @author Alumno Mañana
 */
public class GestionEmpleados {
    static persona p1=new persona("Luis","mora") {};
    static persona p2=new persona("Gonzalo","Moraton") {};
    static persona p=new persona();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\tPROGRAMA DE GESTION DE EMPLEADOS");
        System.out.println("\t================================\n");
        System.out.println(p1);
        System.out.println(p2);
    }
    

    
}
