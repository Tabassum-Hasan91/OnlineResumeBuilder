
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.kohsuke.rngom.digested.Main;

public class ConnectionFactory {
//	String driverClassName = "org.h2.Driver";
//	String connectionUrl = "jdbc:h2:~/test";

        String driverClassName = "com.org.derby.jdbc.EmbeddedDriver";
	String connectionUrl = "jdbc:derby://localhost:1527/ResumeData";

	String dbUser = "sa";
	String dbPwd = "sa";

	private static ConnectionFactory connectionFactory = null;

	private ConnectionFactory() {
		try {
			Class.forName(driverClassName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() throws SQLException {
		Connection conn = null;
		conn = DriverManager.getConnection(connectionUrl, dbUser, dbPwd);
		return conn;
	}

	public static ConnectionFactory getInstance() {
		if (connectionFactory == null) {
			connectionFactory = new ConnectionFactory();
		}
		return connectionFactory;
	}
        
      
}