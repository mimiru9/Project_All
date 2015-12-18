import Project_All.NewSessionBean;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by User on 18.12.2015.
 */
@WebServlet(name = "AddPacientServlet", urlPatterns = {"/add_pacient"})
public class AddPacientServlet extends HttpServlet {

    @EJB
    private NewSessionBean bean;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String surname = request.getParameter("surname");
        String name = request.getParameter("name");

        bean.addPacient(surname, name);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/mypage.jsp");
        dispatcher.forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
