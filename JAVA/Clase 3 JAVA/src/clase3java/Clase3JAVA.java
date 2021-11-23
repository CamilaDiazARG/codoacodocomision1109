
package clase3java;

import personal.Departamento;
import personal.Personal;


public class Clase3JAVA {

  
    public static void main(String[] args) {
      Personal persona = new Personal("Camila","Diaz",25);
      persona.setSueldo(250000);
      
      Personal administrativo = new Personal("Juana","Perez",32);
      administrativo.setSueldo(80000);
      
      Personal mantenimiento = new Personal("Pedro","Gomez",45);
      mantenimiento.setSueldo(60000);
      
        System.out.println("El sueldo para el personal administrativo es: " 
                + administrativo.getSueldo());
        System.out.println("El sueldo para el personal de mantenimiento es: "
                + mantenimiento.getSueldo());
    
        Departamento it = new Departamento("Camila","Diaz",25,"Developer");
        it.setSueldo(500000);
        System.out.println(it.nombre + " esta ganando " + it.getSueldo());
        it.depto="Gerencia General";
        System.out.println(it.MostrarDatos());
        
    }
    
}
