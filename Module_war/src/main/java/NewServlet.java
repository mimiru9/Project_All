import Project_All.NewSessionBean;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;

/**
 * Created by User on 09.12.2015.
 */

@WebServlet(name = "NewServlet", urlPatterns = {"/current", "/"})
public class NewServlet extends HttpServlet{
    @EJB
    private NewSessionBean NewSessionBean;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html");

        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
        req.setAttribute("date123", sdf.format(NewSessionBean.get_time()));

        RequestDispatcher dispatcher = req.getRequestDispatcher("/mypage.jsp");
        dispatcher.forward(req, resp);
    }
    }

