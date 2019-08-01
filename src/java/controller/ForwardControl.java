/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Tabassum.Hasan
 */
@WebServlet(name = "ForwardControl", urlPatterns = {"/ForwardControl"})
public class ForwardControl extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String firstName=request.getParameter("fname");
        String lastName=request.getParameter("lname");
        String designation=request.getParameter("designation");
        String address=request.getParameter("address");
        String email=request.getParameter("email");
        int phone=Integer.parseInt(request.getParameter("phone"));
        String objective=request.getParameter("objective");
        
        HttpSession ses=request.getSession();
               
        ses.setAttribute("fname",firstName);
        ses.setAttribute("lname",lastName);
        ses.setAttribute("designation",designation);
        ses.setAttribute("address",address);
        ses.setAttribute("email",email);
        ses.setAttribute("phone", phone);
        ses.setAttribute("objective",objective);
        
        try 
        {
            
            RequestDispatcher rd;
            rd = request.getRequestDispatcher("/View/AcademicData.jsp");
            rd.forward(request, response);
        }
        catch(Exception e)
        {
            response.sendRedirect("Error.html");
        }
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet ForwardControl</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.print("<form action='../files/Themes/blue/blueResume.jsp'>");
//            out.print("<input type='submit' value='View Resume'");
//            out.print("</form>");
//            out.println("</body>");
//            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
