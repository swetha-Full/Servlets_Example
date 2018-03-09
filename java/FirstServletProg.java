import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import java.io.*;
@WebServlet(
		name="FirstServlet",
		urlPatterns= {"/first"})
	

public class FirstServletProg implements Servlet {
ServletConfig config=null;
	
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		this.config=config;
		System.out.println("Servlet is initiallized");
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return config;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.print("<html><body>");
		out.print("<b>Swetha's first servlet program by implementing servlet interface.</b>");
		out.print("</body></html>");
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "copyright 2007-2008";
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Servlet is destroyed.");
	}

}
