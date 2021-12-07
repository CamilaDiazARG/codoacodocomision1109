package config;

import java.sql.*;

public class Conexion {
    public Connection getConection(){
        Connection conexion = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql//localhost:3306/comision1109",
                    "camidiaz", "123456");
                    
            }catch(ClassNotFoundException | SQLException e){
            System.out.println("e.toString()");
            }
            return conexion;
    }   
    /*public static void main(String[] entrada) throws SQLException{
        Connection c = null;
        Conexion con = new Conexion();
        c = con.getConection();
        PreparedStatement ps;
        ResultSet rs;
        
        ps = c.prepareStatement("SELECT * FROM  actividad obligatoria");
        rs = ps.executeQuery();
        while(rs.next()){
            int id = rs.getInt("id");
            String nombre = rs.getString("nombre");
            String apellido = rs.getString("apellido");
            int edad = rs.getInt("edad");
            
            System.out.println("ID:" + id + " Nombre: " + nombre + " Apellido: "+
                    apellido + " Edad: " + edad);
        }
    }
    */
    
}
