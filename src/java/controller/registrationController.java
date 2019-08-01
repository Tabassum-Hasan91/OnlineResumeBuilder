package controller;

import dao.StudentDAO;
import entity.Student;
import java.io.IOException;
import java.sql.SQLException;


public class registrationController {
	
    public static void main(String args[]) throws SQLException, IOException
    {
        try
        {
            StudentDAO sDao= new StudentDAO();  
     sDao.addStudent(new Student());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
     
    }
	
	


	
}
