package in.co.rays.ctl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.jni.Sockaddr;

@WebServlet("/First")
public class FirstServlet extends HttpServlet {
	
//@Override
//protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//	resp.setContentType("text/html");
//PrintWriter out =resp.getWriter();
//out.println("<h1>Dynamic Project.......!!!!</h1>");
//out.close();
//	
//}
//@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//	
//}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println( "in First Servlet doget");
		resp.sendRedirect("Second");
			}
	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
System.out.println("in First Servlet dopost");
//resp.sendRedirect("Second");
String name=req.getParameter("Second");
req.setAttribute("surname","sharma");
RequestDispatcher rd =req.getRequestDispatcher("Second");
rd.forward(req,resp);
		}
	}