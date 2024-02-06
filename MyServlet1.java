package cls.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//SERVLET INTERFACE
/*
public class MyServlet1 implements Servlet 
{
	//all life cycle methods has to be overriden
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}
	
}
*/

//GENERICSERVLET ABSTRACT CLASS
/*
public class MyServlet1 extends GenericServlet
{
	//service method has to be overriden
	//we do not get doGet and doPost methods
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}
	

}
*/
public class MyServlet1 extends HttpServlet
{
	//no methods has to be overriden
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		// back end code
		System.out.println("IM IN DOGET METHOD");
		PrintWriter pw=res.getWriter();
		pw.print("HELLO WORLD FROM JAVA SERVLET");
	}
}
