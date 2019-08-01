<%-- 
    Document   : SaveAcademicInfo
    Created on : 31 Jul, 2019, 8:45:52 PM
    Author     : Tabassum.Hasan
--%>

<%@page import="dao.AcademicDao"%>
<%@page import="entity.JuniorCollegeInfo"%>
<%@page import="entity.DegreeCollegeInfo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
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
        

        DegreeCollegeInfo dinfo=new DegreeCollegeInfo();
        
        dinfo.setDegClgName(degClgName);
        dinfo.setDegCourse(degClgCourse);
        dinfo.setDegUniversity(degClgUniversity);
        dinfo.setDegCity(degClgCity);
        dinfo.setDegYear(degClgYear);
        
        JuniorCollegeInfo jinfo=new JuniorCollegeInfo();
        jinfo.setJrClgName(jrClgName);
        jinfo.setJrCourse(jrClgCourse);
        jinfo.setJrCity(jrClgCity);
        jinfo.setJrUniversity(jrClgUniversity);
        jinfo.setJrYear(jrClgYear);
        
        HttpSession ses=request.getSession();
        
        AcademicDao ad=new AcademicDao();
            int count =ad.addAcademicInfo(dinfo,jinfo,ses);
            
            if(count==1)
            {         
                RequestDispatcher rd=request.getRequestDispatcher("/AcademicController");
                rd.forward(request, response);

            }
            else
            {
                out.print("Oops some error");
            }
        %>
    </body>
</html>
