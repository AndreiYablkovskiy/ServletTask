package controller.servlet;

import controller.model.gems.Brilliant;
import controller.model.gems.Gem;
import controller.model.gems.Ruby;
import controller.model.gems.Topaz;
import controller.model.jewels.Jewel;
import controller.model.jewels.Necklace;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NecklaceServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Gem> list = new ArrayList<>();
        list.add(new Brilliant("brilliant",3, 18, 150));
        list.add(new Topaz("topaz",5,10,80));
        list.add(new Ruby("ruby",2, 8, 50));
        list.get(0).getGemPrice();
        list.get(1).getGemPrice();
        list.get(2).getGemPrice();
        Jewel necklace = new Necklace(list);

        HttpSession session = req.getSession();
        session.setAttribute("createdNecklace", necklace);

        req.getRequestDispatcher("WEB-INF/jsp/createdNecklace.jsp").forward(req, resp);
    }
}
