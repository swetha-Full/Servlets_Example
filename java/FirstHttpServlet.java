import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.*;

@WebServlet(name = "FirstHttpServletprog", urlPatterns = { "/http/swetha" })
public class FirstHttpServlet extends HttpServlet {
public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
{
	res.setContentType("text/html");
PrintWriter out=res.getWriter();
out.print("<html><body>");
out.print("<b>This is a HttpServlet.");


}
}
