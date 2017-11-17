package com.Demo;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Response_Cookie extends HttpServlet {
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
		
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		Cookie[] ck=req.getCookies();
		
		out.println("Hello \"" +ck[0].getValue()+ "\"");
		out.println("Cookie name is "+ck[0].getName());
		out.println(ck[0].getClass());
		Cookie i =new Cookie("1stcookie","");
		i.setMaxAge(0);
		resp.addCookie(i);
	}
}