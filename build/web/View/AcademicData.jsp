<%-- 
    Document   : AcademicData
    Created on : 26 Jul, 2019, 10:57:10 PM
    Author     : Tabassum.Hasan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="SaveAcademicInfo.jsp">
            <H4>Degree College Information</h4>
            College name:
            <input type="text" name="degClgName" >
            <br>
            
            College course:
            <input type="text" name="degClgCourse" placeholder="BCA">
            <br>
                     
            College City:
            <input type="text" name="degClgCity">
            <br>
            
            College University:
            <input type="text" name="degClgUniversity">
            <br>
            
            College passing year:
            <input type="text" name="degClgYear">
            <br>
            
            <H4>Junior College Information</h4>
            College name:
            <input type="text" name="jrClgName">
            <br>
          
            College Stream:
          
            <input type="text" name="jrClgCourse" placeholder="Science">
            <br>
            
            College City:
            <input type="text" name="jrClgCity">
            <br>
            
            College University:
            <input type="text" name="jrClgUniversity">
            <br>
            
            College passing year:
            <input type="text" name="jrClgYear">
            <br>
            
            <input type="submit" value="Save and Proceed">
        </form>
    </body>
</html>
