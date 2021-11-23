
package niveles;
/**
 * @author Camila
 */
public class Niveles {
    private String dificultad;
    public String experiencia;
    public String checkPoint;

    public Niveles(String experiencia, String checkPoint) {
        this.experiencia = experiencia;
        this.checkPoint = checkPoint;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public String reiniciar(){
        return "Estoy en el nivel: " + this.checkPoint;
        
    }
    
    
}
