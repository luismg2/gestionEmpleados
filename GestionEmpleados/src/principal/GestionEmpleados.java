/*
Crear una clase hija empleado de persona y crear otro dato como numero de Seguridad Social
 */
package principal;

import dominio.empleado;
import dominio.persona;

/**
 *
 * @author Alumno Mañana
 */
public class GestionEmpleados {
    /*
    static persona p1=new persona("Luis","mora") {};
    static persona p2=new persona("Gonzalo","Moraton") {};
    static persona p=new persona();*/
    static empleado e1=new empleado("Luis","Mora");
    static empleado e2=new empleado("Gonzalo","Moraton");
    static empleado e3=new empleado("Elva","Silon");
    static empleado e[]=new empleado[3];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\tPROGRAMA DE GESTION DE EMPLEADOS");
        System.out.println("\t================================\n");
        e[0]=e1;
        e[1]=e2;
        e[2]=e3;
        for(int i=0;i<3;i++){
            System.out.println(e[i]);
        }
        //System.out.println(p1);
        //System.out.println(p2);
    }
    

    
}
