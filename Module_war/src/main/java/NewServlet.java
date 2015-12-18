import Project_All.NewSessionBean;
import entity.Pacient;

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

@WebServlet(name = "NewServlet", urlPatterns = {"/"})
public class NewServlet extends HttpServlet{
    @EJB
    private NewSessionBean bean;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html");

        //SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
        //req.setAttribute("date123", sdf.format(bean.get_time()));
        //bean.testSaveRecord();
        //req.setAttribute("date123", bean.testSaveRecord());


        RequestDispatcher dispatcher = req.getRequestDispatcher("/addPacient.jsp");
        dispatcher.forward(req, resp);

    }

/*    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException,IOException{

        String surname = req.getParameter("surname");
        String name = req.getParameter("name");

        bean.addPacient(surname, name);
    }*/

    }

