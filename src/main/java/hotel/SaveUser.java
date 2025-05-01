package hotel;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/signup")
public class SaveUser extends HttpServlet{
	
	static int result;
	public static int result() {
		return result;
	}
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String name = req.getParameter("userName");
		String email = req.getParameter("userEmail");
		long contact = Long.parseLong(req.getParameter("userContact"));
		String password = req.getParameter("userPwd");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mySql://localhost:3306/project", "root", "root");
			String query = "insert into user(userName,userEmail,userConatct,userPwd) values(?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(query);
			
			pst.setString(1, name);
			pst.setString(2,email);
			pst.setLong(3,contact);
			pst.setString(4,password);
			
			result = pst.executeUpdate();
			
			con.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		res.sendRedirect("login.jsp");
	}

}
