
package alumnos;


public class Alumnos {
    public String nombre,apellido,email,curso;
    private String dni, telefono;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public Alumnos(String nombre,String apellido,String email,String curso){
        this.nombre=nombre;
        this.apellido=apellido;
        this.email=email;
        this.curso=curso;
    }
    /*reformular el metodo*/
    public boolean rendirExamen(String curso, String materias, String tema, float nota){
        if(nota >=6){
                return true;
        }
        else return false;
        
    }  
    
      
 
}
