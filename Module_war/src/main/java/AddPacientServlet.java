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

@WebServlet(name = "AddPacientServlet", urlPatterns = {"/pacient/add_pacient"})
public class AddPacientServlet extends Dispatcher{
    @EJB
    private NewSessionBean bean;


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");

        //SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
        //req.setAttribute("date123", sdf.format(bean.get_time()));

        this.forward("/AddPacient.jsp", request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException,IOException{


        response.setContentType("text/html");

        this.forward("/AddPacient.jsp", request, response);
    }
    }

