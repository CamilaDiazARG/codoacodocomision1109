<<<<<<< HEAD

package clase2java;


public class Ingreso {
    private String usuario,pass;
    private String miUsuario="Cami";
    private String miPass="1234";
  

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String us) {
        this.usuario = us;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    public boolean Validar () {
        return miUsuario.equals(this.usuario) && miPass.equals(this.pass);
    }
 
}
=======

package clase2java;


public class Ingreso {
    private String usuario,pass;
    private String miUsuario="Cami";
    private String miPass="1234";
  

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String us) {
        this.usuario = us;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    public boolean Validar () {
        return miUsuario.equals(this.usuario) && miPass.equals(this.pass);
    }
 
}
>>>>>>> 3fa84b313b1e23d0e52985a3d5a2fd68547a6124
