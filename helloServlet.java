import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class helloServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request,
			HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>helloServlet Response</title>");
		out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"../../style.css\"/>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>First Web Application</h1>");
		
		String name = request.getParameter("name");
		
		if(name != null)
			out.println("Hi there, " + name + "!\n");
		else
			out.println("You didn't enter any text!\n");
		
		out.println("<br/>");
		out.println("<a href=\"../../index.html\">"
				+ "Return to form...</a>");
		
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
}
