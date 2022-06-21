/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
@WebServlet(name = "PruebaServlet", value = "/PruebaServlet")
public class prueba extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        try{
            PacienteDAO  p1= new PacienteDAO();
            Paciente  p2 = new Paciente("1111","Daniel","Barrientos","daniel11");
            p1.insertarPaciente(p2);
            request.setAttribute("paciente", p2);


            request.getRequestDispatcher("prueba.jsp").forward(request, response);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
