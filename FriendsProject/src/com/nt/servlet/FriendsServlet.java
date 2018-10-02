package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/friendsurl")
public class FriendsServlet extends HttpServlet {

	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		//Genral settings
		String name1=null;
		String n1="sowmya";
		String n2="haritha";
		String n3="amulya";
		String n4="mallika";
		String n5="mounika";
		String n6="karunya";
		
		PrintWriter pw=null;
		pw=res.getWriter();
		res.setContentType("text/html");
		name1=req.getParameter("n1");
		
		
		
		
		    if(name1.equals(n1))
		    {
		          pw.println("<marquee><h1 style='color:red;text-align=center'>Good Talktive Gril</h1></marquee>");
        	  pw.println("<center><img src='sowmya.jpg' width='350' height='400' /></center>");
        	  pw.println("<h1 style=color:'red'><marquee>Sowmya</marquee></h1>");
		    }
		    else if(name1.equals(n2))
		    {
		        pw.println("<marquee><h1 style='color:red;text-align=center'>Good Attractive Gril</h1></marquee>");
	        	  pw.println("<center><img src='haritha1.jpg'  width='350' height='400' /></center>");
	        	  pw.println("<h1 style=color:'green'><marquee>Haritha</marquee></h1>");
			    }
		    else if(name1.equals(n3))
		    {
		        pw.println("<marquee><h1 style='color:red;text-align=center'>Cute Gril </h1></marquee>");
	        	  pw.println("<center><img src='amulya.jpg'  width='350' height='400' /></center>");
	        	  pw.println("<h1 style=color:'blue'><marquee>Amulya</marquee></h1>");
			    }
		    else if(name1.equals(n4))
		    {
	              pw.println("<marquee><h1 style='color:red;text-align=center'>Good Gril</h1></marquee>");
	        	  pw.println("<center><img src='mallika1.jpg' width='350' height='400' /></center>");
	        	  pw.println("<h1 style=color:'silver'><marquee>Malllika</marquee></h1>");
			    }
		    else if(name1.equals(n5))
		    {
		        pw.println("<marquee><h1 style='color:red;text-align=center'>Good Caring Gril</h1></marquee>");
	        	  pw.println("<center><img src='mounika.jpg'  width='350' height='400' /></center>");
	        	  pw.println("<h1 style=color:'yellow'><marquee>Mounika</marquee></h1>");
			    }
		    else if(name1.equals(n6))
		    {
		        pw.println("<marquee><h1 style='color:red;text-align=center'>She never feels jealsouy</h1></marquee>");
	        	  pw.println("<center><img src='karunya.jpg'  width='350' height='400' /></center>");
	        	  pw.println("<h1 style=color:'pink'><marquee>Karunya</marquee></h1>");
			    }
		    
		    pw.println("<center><a href='form.html'><img src='friends.jpg'  width='150' height='150'></a></center>");
		    
		    
	
		pw.close();
		
	}

	

}
