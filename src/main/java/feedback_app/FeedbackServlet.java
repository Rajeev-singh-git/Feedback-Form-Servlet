package feedback_app;

import java.io.IOException;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/feedback")
public class FeedbackServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 1. Read form data
	    String email = req.getParameter("email");
	    String phone = req.getParameter("phone");
	    String feedbackMessage = req.getParameter("feedback_message");
		
		
	    // 2. Put data into request scope (MODEL)
	    req.setAttribute("email", email);
        req.setAttribute("phone", phone);
        req.setAttribute("feedbackMessage", feedbackMessage);
        
        
        

        // 3. Forward to JSP (VIEW) 
        // RequestDispatcher in action: Server-side forward to JSP using the same request
        // (no redirect, URL unchanged)
        RequestDispatcher dispatcher =
                req.getRequestDispatcher("/feedback-result.jsp");

        dispatcher.forward(req, resp);
	}
	
}
