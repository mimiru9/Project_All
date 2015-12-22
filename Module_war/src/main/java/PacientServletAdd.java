import Project_All.NewSessionBean;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**
 * Created by User on 18.12.2015.
 */
@WebServlet(name = "PacientServletAdd", urlPatterns = {"/pacient/add_pacient/add"})
public class PacientServletAdd extends Dispatcher {

    @EJB
    private NewSessionBean bean;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        request.setCharacterEncoding("UTF8");

        //if(request.getParameter("add")!=null) {

        bean.addPacient(request.getParameter("surname"), request.getParameter("name"), request.getParameter("patronymic"),
                request.getParameter("birthday"), request.getParameter("gender"), request.getParameter("address"),
                request.getParameter("phone"), request.getParameter("e_mail"), request.getParameter("strah_polis"));
        this.forward("/PacientAdd.jsp", request, response);
        //}
        //else if(request.getParameter("cancel")!=null){
            //this.forward("/PacientServlet.java", request, response);
        //}

    }

}
