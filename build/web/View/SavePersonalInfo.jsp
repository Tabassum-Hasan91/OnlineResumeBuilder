<%-- 
    Document   : SavePersonalInfo
    Created on : 26 Jul, 2019, 6:49:30 PM
    Author     : Tabassum.Hasan
--%>

<%@page import="dao.PersonalDao"%>
<%@page import="entity.PersonalInfo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String firstName=request.getParameter("fname");
            String lastName=request.getParameter("lname");
            String designation=request.getParameter("designation");
            String address=request.getParameter("address");
            String email=request.getParameter("email");
            int phone=Integer.parseInt(request.getParameter("phone"));
            String objective=request.getParameter("objective");
            
            PersonalInfo pi=new PersonalInfo();
            pi.setFirstName(firstName);
            pi.setLastName(lastName);
            pi.setDdesignation(designation);
            pi.setAddress(address);
            pi.setEmail(email);
            pi.setPhone(phone);
            pi.setObjective(objective);
            
            HttpSession ses=request.getSession(true);
            ses.setAttribute("uname",firstName+lastName);
            
            PersonalDao pdao=new PersonalDao();
            int count =pdao.addPersonalInfo(pi,ses);
            
            if(count==1)
            {         
                RequestDispatcher rd=request.getRequestDispatcher("/ForwardControl");
                rd.forward(request, response);

            }
            else
            {
                out.print("Oops some error");
            }
        %>
    </body>
</html>
