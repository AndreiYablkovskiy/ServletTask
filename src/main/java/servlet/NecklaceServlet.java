package servlet;

import model.gems.Brilliant;
import model.gems.Gem;
import model.gems.Ruby;
import model.gems.Topaz;
import model.jewels.Jewel;
import model.jewels.Necklace;
import service.NecklaceService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class NecklaceServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Gem> list = new ArrayList<>();
        list.add(new Brilliant(3, 18, 150));
        list.add(new Topaz(5,10,80));
        list.add(new Ruby(2, 8, 50));
        list.get(0).getGemPrice();
        list.get(1).getGemPrice();
        list.get(2).getGemPrice();
        Jewel necklace = new Necklace(list);

        HttpSession session = req.getSession();
        session.setAttribute("createdNecklace", necklace);

        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<body>");
        writer.println("<h1> The necklace is created, composition : </h1>");
        writer.println("<p> One brilliant gem </p>");
        writer.println("<p> One topaz gem </p>");
        writer.println("<p> One ruby gem </p>");
        writer.println(">> <a href=\"http://localhost:8080/description\"><b>To see the full description</b></a> <<");
        writer.println("</body>");
        writer.println("</html>");
    }
}
