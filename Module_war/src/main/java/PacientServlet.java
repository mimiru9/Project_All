import Project_All.NewSessionBean;
import manager.PacientRow;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 18.12.2015.
 */
@WebServlet(name = "PacientServlet", urlPatterns = {"/pacient"})
public class PacientServlet extends Dispatcher{

    @EJB
    private NewSessionBean bean;

/*    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        //bean.getList();
        this.forward("/ListPacient.jsp", request, response);
    }*/

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        List<PacientRow> pacList = bean.getAll();
        request.setAttribute("pacList", pacList);
        this.forward("/ListPacient.jsp", request, response);
    }
}
