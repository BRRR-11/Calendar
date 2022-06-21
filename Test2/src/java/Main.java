
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Main {
  public void main(String args[]){

//     PacienteDAO  p1= new PacienteDAO();
//     Paciente  p2 = new Paciente("1111","Daniel","Barrientos","daniel11");
//     p1.insertarPaciente(p2);

    String url = "jdbc:mysql://localhost:3306/cliente";
    String username = "root";
    String password = "Gegred@g@1998";

    System.out.println("Connecting database...");

    try (Connection connection = DriverManager.getConnection(url, username, password)) {
        System.out.println("Database connected!");
    } catch (SQLException e) {
        throw new IllegalStateException("Cannot connect the database!", e);
    }
}
    
}

