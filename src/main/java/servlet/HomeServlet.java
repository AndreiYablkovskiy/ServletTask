package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<body>");
        writer.println("<h1> Welcome to the jewelry store </h1>");
        writer.println("<p> To create a necklace, follow the link below </p>");
        writer.println(">> <a href=\"http://localhost:8080/necklace\">Create a necklace</a> <<");
        writer.println("</body>");
        writer.println("</html>");

    }
}
