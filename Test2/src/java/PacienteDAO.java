
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class PacienteDAO implements Serializable{
    
    public final static Connection con= coneccion.getConnection();
   public boolean insertarPaciente(Paciente p)
    {
        //cedula,nombre,apellido y clave

        try
        {
            String consulta ="insert into paciente(cedula,nombre,apellidos,clave) values(?,?,?,?)";
            PreparedStatement stm1 = con.prepareStatement(consulta);
            stm1.setString(1,p.getCedula());
            stm1.setString(2,p.getNombre());
            stm1.setString(3,p.getApellido());
            stm1.setString(4,p.getClave());
            stm1.execute();
           // System.out.println("si sirveeeee");
            return true;


        }catch(SQLException ex) {
 
            System.out.println("Error:" + ex.fillInStackTrace());
            return false;
        }
    }
}
