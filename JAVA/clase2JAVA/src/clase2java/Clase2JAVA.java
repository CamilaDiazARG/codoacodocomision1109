<<<<<<< HEAD

package clase2java;

import java.util.Scanner;

public class Clase2JAVA {
    


    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in) ; 
        System.out.println("Ingrese su nombre de usuario:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su contraseña:");
        String pass = scanner.nextLine();
        
        Ingreso ing = new Ingreso();
        ing.setUsuario(nombre);
        ing.setPass(pass);
        
        System.out.println(ing.Validar());
     

    }
    
}
=======

package clase2java;

import java.util.Scanner;

public class Clase2JAVA {
    


    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in) ; 
        System.out.println("Ingrese su nombre de usuario:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su contraseña:");
        String pass = scanner.nextLine();
        
        Ingreso ing = new Ingreso();
        ing.setUsuario(nombre);
        ing.setPass(pass);
        
        System.out.println(ing.Validar());
     

    }
    
}
>>>>>>> 3fa84b313b1e23d0e52985a3d5a2fd68547a6124
