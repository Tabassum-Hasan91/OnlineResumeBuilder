<%-- 
    Document   : PersonalInfo
    Created on : 26 Jul, 2019, 12:11:42 PM
    Author     : Tabassum.Hasan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
        <title>Personal Information</title>
    </head>
    <body>
        <div>
            <h2>Welcome to online Resume Builder</h2>
            <h4>Please Enter your Personal Information</h4>
            <form action="SavePersonalInfo.jsp">
                
                <div class="form-group">
                
                <label class="control-label col-sm-2" for="pwd">First Name:</label>
                <div class="col-sm-10">    
                <input type="text" class="form-control" name="fname" value="" autofocus="true" placeholder="Smith">
                </div>
                </div>
                <br><br>
                
                 <div class="form-group">
                
                <label class="control-label col-sm-2" for="pwd">Last Name:</label>
                <div class="col-sm-10"> 
                <input type="text" class="form-control" name="lname" value="" placeholder="Jones">
                 </div>
                 </div>
                <br><br>
                
                 <div class="form-group">
                
                <label class="control-label col-sm-2" for="pwd">Current Designation:</label>
                <div class="col-sm-10"> 
                <input type="text" class="form-control" name="designation" value="" placeholder="Fresher">
                 </div>
                 </div>
                <br><br>
                
                 <div class="form-group">
                
                <label class="control-label col-sm-2" for="pwd">Address:</label>
                <div class="col-sm-10"> 
                <textarea name="address" class="form-control"></textarea>
                 </div>
                 </div>
                
                <br><br>
                 <div class="form-group">
                
                <label class="control-label col-sm-2" for="pwd">Email:</label>
                <div class="col-sm-10"> 
                <input type="text" class="form-control" name="email" value="" placeholder="sample@example.com">
                 </div>
                 </div>
                
                <br><br>
                 <div class="form-group">
               
               <label class="control-label col-sm-2" for="pwd">Phone Number:</label>
                <div class="col-sm-10"> 
                <input type="text" class="form-control" name="phone" value="" placeholder="8449922330">
                 </div>
                 </div>
                
                <br><br>
                 <div class="form-group">
                
                <label class="control-label col-sm-2" for="pwd">One Line Objective:</label>
                <div class="col-sm-10"> 
                <textarea name="objective">Looking for a challenging job
                </textarea>
                 </div>
                 </div>
                
                <br><br>
                
                 <div class="form-group">
                     
                <input type="submit" class="btn btn-default" value="Save and Proceed">
                 </div>
            </form>
        </div>
    </body>
</html>
