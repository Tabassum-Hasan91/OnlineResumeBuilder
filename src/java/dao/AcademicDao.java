/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.DegreeCollegeInfo;
import entity.JuniorCollegeInfo;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Tabassum.Hasan
 */
public class AcademicDao 
{
    public  static int addAcademicInfo(DegreeCollegeInfo degClg,JuniorCollegeInfo jrClg,HttpSession ses) throws IOException, SQLException,ClassNotFoundException 
        {
		
		String queryDeg ="insert into degreedata(uname,collegename,course,city,university,degyear) values(?,?,?,?,?,?)";
		String queryJunior="insert into juniorcollege(uname,collegename,course,city,passingyear) values(?,?,?,?,?)";;
                
		Connection con=ConnectionFactory.getInstance().getConnection();
                
		PreparedStatement st = con.prepareStatement(queryDeg);
		
                st.setString(1,(String) ses.getAttribute("uname"));
		st.setString(2,degClg.getDegClgName());
		st.setString(3,degClg.getDegCourse());
		st.setString(4,degClg.getDegCity());
		st.setString(5,degClg.getDegUniversity());
		st.setString(6,degClg.getDegYear());
                
                

		int count=st.executeUpdate();
		st.close();
                
                //pass the session value here as a parameter to this function so that it can be set in the uname and create the session object in the save personal info page
                PreparedStatement st1 = con.prepareStatement(queryJunior);
		//st.setString(1,);
                //st1.setString(1, de.getFirstName()+s.getLastName());
                st1.setString(1, (String) ses.getAttribute("uname"));
		st1.setString(2,jrClg.getJrClgName());
		st1.setString(3,jrClg.getJrCourse());
		st1.setString(4,jrClg.getJrCity());
		st1.setString(5,jrClg.getJrYear());
		
                int count1=st1.executeUpdate();
		st1.close();
		con.close();
                
                if(count==1&&count1==1)
                {
                    return 1;
                }
                return 0;
                

	}
}
