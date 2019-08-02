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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
        <title>Academic Information</title>
    </head>
    <body>
        
        <h2>Welcome to online Resume Builder</h2>
        <h4>Please Enter your Academic Information</h4>

        <form action="SaveAcademicInfo.jsp">
            <H4>Degree College Information</h4>
            
            <div class="form-group">
                <label class="control-label col-sm-2" for="pwd">College name:</label>
                <div class="col-sm-10">
                    <input type="text" name="degClgName" CLASS="form-control" >
                </div>
            </div>
                  
            <br>
            
            
            <div class="form-group">
                <label class="control-label col-sm-2" for="pwd">College course:</label>
                <div class="col-sm-10">
                    <input type="text" name="degClgCourse" placeholder="BCA" class="form-control">
                </div>
            </div>
            <br>
                     
            
            <div class="form-group">
                <label class="control-label col-sm-2" for="pwd">College City:</label>
                <div class="col-sm-10">
                    <input type="text" name="degClgCity" class="form-control">
                </div>
            </div>
            <br>
            
            
            <div class="form-group">
                <label class="control-label col-sm-2" for="pwd">College University:</label>
                <div class="col-sm-10">
                    <input type="text" name="degClgUniversity" class="form-control">
                </DIV>
            </div>
            <br>
            
            
            <div class="form-group">
                <label class="control-label col-sm-2" for="pwd">College passing year:</label>
                <div class="col-sm-10">
                    <input type="text" name="degClgYear" class="form-control">
                </div>
            </div>
            <br>
            
            <H4>Junior College Information</h4>
            
            
            <div class="form-group">
                <label class="control-label col-sm-2" for="pwd">College name:</label>
                <div class="col-sm-10">
                    <input type="text" name="jrClgName" class="form-control">
                </div>
            </div>
            <br>
          
            
          
            <div class="form-group">
                <label class="control-label col-sm-2" for="pwd">College Stream:</label>
                <div class="col-sm-10">
                    <input type="text" name="jrClgCourse" placeholder="Science" class="form-control">
                </div>
            </div>
                    
            <br>
            
            
            <div class="form-group">
                <label class="control-label col-sm-2" for="pwd">College City:</label>
                <div class="col-sm-10">
                        <input type="text" name="jrClgCity" class="form-control">
                </div>
            </div>
            <br>
            
            
            <div class="form-group">
                <label class="control-label col-sm-2" for="pwd">College University:</label>
                <div class="col-sm-10">
                    <input type="text" name="jrClgUniversity" class="form-control">
                </div>
            </div>
            <br>
            
            
           <div class="form-group">
                <label class="control-label col-sm-2" for="pwd">College passing year:</label>
                <div class="col-sm-10">
                    <input type="text" name="jrClgYear" class="form-control">
                </div>
           </div>
            <br>
            
            <div class="form-group">
                     
                <input type="submit" class="btn btn-default" value="Save and Proceed">
             </div>

            
        </form>
    </body>
</html>
