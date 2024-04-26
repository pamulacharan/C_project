package Pamula;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class C_project extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		String i,j,k;
		PrintWriter out = res.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<title>");
		out.println("</title>");
		out.println("<style>");
		out.println("body {");
		out.println("    font-family: Arial, sans-serif;");
		out.println(" background-color: #10ec47d4;");
		out.println("    display: flex;");
		out.println("    align-items: center;");
		out.println("    justify-content: center;");
		out.println("    height: 100vh;");
		out.println("    margin: 0;");
		out.println("    padding: 20px;");
		out.println("}");
		out.println("</style>");
		out.println("<body>");
		out.println("<center>");
		i =	(req.getParameter("username"));
		j =	(req.getParameter("password"));
		k = (req.getParameter("comments"));
		out.println("<h4><p>This is username:  "+i+"</p></h4>");
		out.println("<h4><p>This is password:  "+j+"</p></h4>");
		out.println("<h4><p>This is comment:  "+k+"</p></h4>");
		out.close();
		out.println("<center>");
		out.println("/body");
		out.println("</html>");
	}
}
