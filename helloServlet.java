//	Henry Olson
//	helloServlet.java
//	A servlet that accepts a "name" from POST and prints it back out to the user

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class helloServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	//handles POST
	public void doPost(HttpServletRequest request,
			HttpServletResponse response)
			throws ServletException, IOException {
		
		//prepare writer
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		//standard html stuff
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>helloServlet Response</title>");
		out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"../../style.css\"/>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>First Web Application</h1>");
		
		//get name from POST
		String name = request.getParameter("name");
		
		//check for input and print message accordingly
		if(!name.isEmpty())
			out.println("Hi there, " + name + "!\n");
		else
			out.println("You didn't enter any text\n");
		
		out.println("<br/>");
		
		//link to return
		out.println("<a href=\"../../index.html\">"
				+ "Return to form</a>");
		
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
}
