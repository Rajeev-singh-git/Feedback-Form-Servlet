package feedback_app.session.manage;

import java.io.IOException;
import java.util.UUID;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/servlet1")
public class Request1servlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		 String username = "durgesh";
		 String userid = "123456";
		 
		 Cookie cookie = new Cookie("username", username);
		 var cookie1 = new Cookie("userid",userid);
		 
		 cookie.setMaxAge(10*60);
		 cookie1.setMaxAge(5*60);
		 resp.addCookie(cookie);
		 resp.addCookie(cookie1);
		 
        //http session
		 HttpSession session = req.getSession();
		 session.setAttribute("userSecret", UUID.randomUUID().toString());
		 
		 session.setMaxInactiveInterval(10*60);
		 
		 resp.setContentType("text/html");
		 resp.getWriter().println("<h1>Cookie set successfully</h1>");
		 	 
	}	
	
}
