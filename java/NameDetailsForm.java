import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.*;

@WebServlet(
		name="NameDetails",
		urlPatterns= {"/welcome"})
public class NameDetailsForm extends HttpServlet{
	
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		res.setContentType("text/html");
		
		PrintWriter out=res.getWriter();
		String name=req.getParameter("name");
		out.print("WELCOME "+name);
		out.close();
		
	}

}
