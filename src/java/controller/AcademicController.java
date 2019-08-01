/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "AcademicController", urlPatterns = {"/AcademicController"})
public class AcademicController extends HttpServlet {

    
    
  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String degClgName=request.getParameter("degClgName");
        String degClgCourse=request.getParameter("degClgCourse");
        String degClgCity=request.getParameter("degClgCity");
        String degClgUniversity=request.getParameter("degClgUniversity");
        String degClgYear=request.getParameter("degClgYear");
        
        String jrClgName=request.getParameter("jrClgName");
        String jrClgCourse=request.getParameter("jrClgCourse");
        String jrClgCity=request.getParameter("jrClgCity");
        String jrClgUniversity=request.getParameter("jrClgUniversity");
        String jrClgYear=request.getParameter("jrClgYear");
        
        HttpSession ses=request.getSession();
               
        ses.setAttribute("degClgName",degClgName);
        ses.setAttribute("degClgCourse",degClgCourse);
        ses.setAttribute("degClgCity",degClgCity);
        ses.setAttribute("degClgUniversity",degClgUniversity);
        ses.setAttribute("degClgYear",degClgYear);
        
        ses.setAttribute("jrClgName",jrClgName);
        ses.setAttribute("jrClgCourse",jrClgCourse);
        ses.setAttribute("jrClgCity",jrClgCity);
        //ses.setAttribute("jrClgUniversity",jrClgUniversity);
        ses.setAttribute("jrClgYear",jrClgYear);
        
        response.sendRedirect("../View/Template.html");
        
       
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
