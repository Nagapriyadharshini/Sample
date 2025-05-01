package hotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao {
	
	public Connection getConnection() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mySql://localhost:3306/project", "root", "root");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public User findByEmail(String email){
	
		try {
			Connection con = getConnection();
			PreparedStatement pst = con.prepareStatement("select * from user where userEmail=?");
			pst.setString(1, email);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				return new User(rs.getString(1),rs.getString(2),rs.getLong(3),rs.getString(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
