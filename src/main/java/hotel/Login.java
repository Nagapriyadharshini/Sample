package hotel;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class Login extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("u_email");
		String password = req.getParameter("u_password");
		
		Dao dao = new Dao();
//			User user =  null;
			try {
				User user = dao.findByEmail(email);
				if(user != null) {
					if(password.equals(user.getUserPassword())) {
//						System.out.println("email");
						HttpSession session = req.getSession();
						session.setAttribute("user", user);
						req.getRequestDispatcher("home.jsp").forward(req, resp);
//						resp.sendRedirect("home.jsp");
					}
					else {
						req.setAttribute("message", "inavlid password");
						req.getRequestDispatcher("index.jsp").forward(req, resp);
					}
				}
				else {
					req.setAttribute("message", "inavlid email");
					req.getRequestDispatcher("index.jsp").forward(req, resp);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			

	}

}
