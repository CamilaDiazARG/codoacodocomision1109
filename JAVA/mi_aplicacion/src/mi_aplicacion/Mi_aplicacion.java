
package mi_aplicacion;

import niveles.Niveles;
        
public class Mi_aplicacion {
  
    public static void main(String[] args) {
        Juego jugador = new Juego(0,3,"Pepe","ak45","Maloso");
        Juego jugador1 = new Juego(0,3,"Pepito","ak49","Maloso");
        System.out.println("Soy "+jugador.personaje);
        System.out.println(jugador1.personaje);
        System.out.println(jugador.mostras_vidas());
        //Sout y tab 
        // TODO code application logic here
        Niveles niveles = new Niveles("media","dos");
        niveles.setDificultad("principiante");
        System.out.println(niveles.getDificultad());
        jugador.vidas=0;
        
        if(jugador.vidas==0){
            System.out.println(niveles.reiniciar());
        }
    }
 
}


