
package mi_aplicacion;
/**
 * @author Camila
 */
public class Juego {
    //declaración propiedades
    public int puntos, vidas;
    public String personaje, armas, enemigos;
    //constructor
    Juego(int puntos,int vidas,String personaje,String armas,String enemigos){
    this.puntos=puntos;
    this.vidas=vidas;
    this.personaje=personaje;
    this.armas=armas;
    this.enemigos=enemigos;
    
    }
    
    public String mostras_vidas(){
        return "Soy " +this.personaje+ " y tengo " + this.vidas + " vidas";
    }
}