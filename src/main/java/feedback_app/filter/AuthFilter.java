package feedback_app.filter;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AuthFilter implements Filter{
	
	
   @Override
   public void init(FilterConfig filterConfig) {
	        System.out.println("AuthFilter initialized");
	}

   @Override
   public void doFilter(ServletRequest request, ServletResponse response,
                        FilterChain chain)
           throws IOException, ServletException {

       HttpServletRequest req = (HttpServletRequest) request;
       HttpServletResponse resp = (HttpServletResponse) response;
       
       HttpSession session = req.getSession(false);

       // 🔒 Filter logic (this is the core concept)
       if (session == null || session.getAttribute("userSecret") == null) {

           resp.setContentType("text/html;charset=UTF-8");

           String html = String.format("""
               <h1>Access Denied</h1>
               <p>Please visit Servlet1 to create a session first.</p>
               <a href="%s/servlet1">Go to Servlet1</a>
           """, req.getContextPath());

           resp.getWriter().println(html);
           return; // ⛔ stop request
       }

       // ✅ Allow request to continue
       chain.doFilter(request, response);
   }
   
   
   @Override
   public void destroy() {
       System.out.println("AuthFilter destroyed");
   }
   
   
   
}
