/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.PersonalInfo;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.servlet.http.HttpSession;
/**
 *
 * @author Tabassum.Hasan
 */
public class PersonalDao {
    
    
	public  static int addPersonalInfo(PersonalInfo s,HttpSession ses) throws IOException, SQLException,ClassNotFoundException 
        {
		
		String query ="insert into personaldata(uname,fname,lname,designation,email,phone,objective,address) values(?,?,?,?,?,?,?,?)";
		
		Connection con=ConnectionFactory.getInstance().getConnection();
                
		PreparedStatement st = con.prepareStatement(query);
		//st.setString(1, s.());
                st.setString(1, (String) ses.getAttribute("uname"));
		st.setString(2,s.getFirstName());
		st.setString(3,s.getLastName());
		st.setString(4,s.getDesignation());
		st.setString(5,s.getEmail());
		st.setInt(6,s.getPhone());
                st.setString(7,s.getAddress());
                st.setString(8,s.getObjective());
                

		int count=st.executeUpdate();
		st.close();
		con.close();
                
                return count;

	}
    
}
