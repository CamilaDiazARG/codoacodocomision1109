package config;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class basedeDatos {
    public String driver = "com.mysql.cj.jdbc.Driver";
    public Connection getConection()throws SQLException{
            Connection conexion = null;
            try{
                Class.forName(driver);
                conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/comision1109",
                            "camidiaz" , "123456");
            }catch(SQLException e){ //una clase de java trans a string el error
                System.out.println(e.toString());
            }catch (ClassNotFoundException ex){
                Logger.getLogger(basedeDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
            return conexion;
    }
    public static void main(String [] argms) throws SQLException{
        basedeDatos con = new basedeDatos();
        
        Connection conexion = null;
        conexion = con.getConection();
        
        PreparedStatement ps; //clase de java
        ResultSet rs;
        
        ps = conexion.prepareStatement("SELECT * FROM `actividad obligatoria`");
        rs = ps.executeQuery();
        
        while(rs.next()){ //mientras existan datos
        int id = rs.getInt("id");
        String nombre = rs.getString("nombre");
        String apellido = rs.getString("apellido");
        int edad = rs.getInt("edad");
            System.out.println("ID: " + id + " Nombre: "+ nombre+ " Apellido: "+apellido+ " Edad: "+ edad);
        }
 
    }
}
