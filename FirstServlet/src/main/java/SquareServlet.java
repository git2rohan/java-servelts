import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sq")
public class SquareServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		
		int k=0;
		//If req has attribute k
		//k = (int)req.getAttribute("k");
		
		//otherwise, take k from url as from URL Re-written
		//k = Integer.parseInt(req.getParameter("k"));
		
		//session
		HttpSession session = req.getSession();
		k = (int)session.getAttribute("k");
		
		//Cookie
//		Cookie cookies[] = req.getCookies();
//		for(Cookie c : cookies)
//		{
//			if(c.getName().equals("k"))
//			{
//				k = Integer.parseInt(c.getValue());
//			}
//		}
		
		//Find square
		int sq = k * k;
		PrintWriter pw = resp.getWriter();
		pw.println("Square of sum of number : "+sq);
		pw.println("name : "+session.getAttribute("name"));
		pw.println("surname : "+session.getAttribute("surname"));
		
		
		pw.close();
		
	}
}
