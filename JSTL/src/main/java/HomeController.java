import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")
public class HomeController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = "Rohan Soudey";
		req.setAttribute("name", name);
		
		List<Student> students = Arrays.asList(new Student("Rohan Soudey", "10th"), new Student("Kajal yadav", "11th"));
		
		req.setAttribute("students", students);
		req.getRequestDispatcher("home.jsp").forward(req, resp);
	}
}
