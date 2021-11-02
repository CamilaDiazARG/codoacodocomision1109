/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mi_aplicacion;

/**
 *
 * @author Camila
 */
public class Mi_aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Juego jugador = new Juego(0,3,"Pepe","ak45","Maloso");
        Juego jugador1 = new Juego(0,3,"Pepito","ak49","Maloso");
        System.out.println("Soy "+jugador.personaje);
        System.out.println(jugador1.personaje);
        System.out.println(jugador.mostras_vidas());
        //Sout y tab 
        // TODO code application logic here
    }
    
}


