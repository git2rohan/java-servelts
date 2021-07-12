import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebServlet("/add") //we are using xml based config for this servlet class
public class AddServlet extends HttpServlet {
	
//	public void service(HttpServletRequest req, HttpServletResponse res)
//	{
//		int i = Integer.parseInt(req.getParameter("num1"));
//		int j = Integer.parseInt(req.getParameter("num2"));
//		System.out.println(i+j);
//	}
	
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		PrintWriter pw = resp.getWriter();
//		pw.println("Result is : "+(Integer.parseInt(req.getParameter("num1"))+Integer.parseInt(req.getParameter("num2"))));
//		pw.close();
//	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			
			int i = Integer.parseInt(req.getParameter("num1"));
			int j = Integer.parseInt(req.getParameter("num2"));
			
			int k = i+j;
			
			//Let's access Servlet Context shared details - 
			ServletContext ct = getServletContext();
			String name = ct.getInitParameter("name");
			
			//Let;s access servlet config for this servlet
			ServletConfig cg = getServletConfig();
			String surname = cg.getInitParameter("surname");
			
			//Forward these request objects into another servlet to find square
			//req.setAttribute("k", k);
			//RequestDispatcher rd = req.getRequestDispatcher("sq");
			//rd.forward(req, resp);
			
			//URL Re-writing with send Redirect ( alternative for requestDispacher)
			//resp.sendRedirect("sq?k="+k);
			
			//Session
			HttpSession session = req.getSession();
			session.setAttribute("k", k);
			session.setAttribute("name", name);
			session.setAttribute("surname", surname);
			resp.sendRedirect("sq");
			
			
			//Cookies
			//Cookie cookie = new Cookie("k", k+"");
			//resp.addCookie(cookie);
			//resp.sendRedirect("sq");
			
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		
		
		

	}
}
