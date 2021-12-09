package modelo;

import config.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class AlumnosDAO {
    Connection conexion;
    public AlumnosDAO(){
        Conexion con = new Conexion();
        conexion = con.getConection();
        
    }
    public List<Alumnos> listarAlumnos(){
        PreparedStatement ps;
        ResultSet rs;
        List<Alumnos> lista = new ArrayList<>();
        //Lista clase abstracta
        try{
            ps = conexion.prepareStatement("SELEC * FROM alumnos");
            rs = ps.executeQuery();
            
            while(rs.next()){
                int id = rs.getInt("id");
                    String nombres = rs.getString("nombre");
                    String apellidos = rs.getString("apellido");
                    String email = rs.getString("email");
                    int telefono = rs.getInt("telefono");
                    Alumnos alumnos = new Alumnos(id,nombres,apellidos,email,telefono);
                    lista.add(alumnos) ;
            }
            return lista;
            
        }catch(SQLException e){
            System.out.println(e.toString());
            return null;
            }
    }
    
    public Alumnos mostrarAlumno(int _id){
        PreparedStatement ps;
        ResultSet rs;
        Alumnos alumno = null;
        
        try{
            ps = conexion.prepareStatement("SELEC id,nombres,apellidos,email,telefono "
                    + "FROM alumnos WHERE id = ?");
            ps.setInt(1, _id);
            rs = ps.executeQuery();
            
            while(rs.next()){
                int id = rs.getInt("id");
                    String nombres = rs.getString("nombre");
                    String apellidos = rs.getString("apellido");
                    String email = rs.getString("email");
                    int telefono = rs.getInt("telefono");
                    Alumnos alumnos = new Alumnos(id,nombres,apellidos,email,telefono);
                    alumno = new Alumnos(id,nombres,apellidos,email,telefono) ;
                }
                return alumno;
            
        }catch(SQLException e){
            System.out.println(e.toString());
            return null;
        }
    }
        
  }
