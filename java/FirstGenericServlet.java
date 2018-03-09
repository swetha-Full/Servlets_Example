import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
@WebServlet(
		name="FirstGenericServlet",
		urlPatterns= {"First.html"})
public class FirstGenericServlet extends GenericServlet {


	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.print("<html><body>");
		out.print("<b>This is a gerneric servlet class.</b>");
		out.print("</body></html>");
		
	}

}
