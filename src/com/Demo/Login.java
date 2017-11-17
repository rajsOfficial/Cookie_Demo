package com.Demo;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Login extends HttpServlet {
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
		
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		String id=req.getParameter("id");
		String pwd=req.getParameter("pwd");
		out.println("Welcome  \""+id+"\"");
		Cookie s=new Cookie("1stcookie",id);
		
		resp.addCookie(s);
		out.println("<form action='Response' method='post'>");
		out.println("<Input type='submit' value='Login'>");
		out.println("</form>");
		
	}

}
