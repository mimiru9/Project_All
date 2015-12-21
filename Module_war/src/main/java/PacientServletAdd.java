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

        if(request.getParameter("add")!=null) {

            String surname = request.getParameter("surname");
            String name = request.getParameter("name");
            String patronymic = request.getParameter("patronymic");
            String birthday = request.getParameter("birthday");
            String gender = request.getParameter("gender");
            String address = request.getParameter("address");
            String phone = request.getParameter("phone");
            String eMail = request.getParameter("e_mail");
            String strahPolis = request.getParameter("strah_polis");

            bean.addPacient(surname, name, patronymic, birthday,gender,address, phone, eMail, strahPolis);
            this.forward("/PacientAdd.jsp", request, response);
        }
        //else if(request.getParameter("cancel")!=null){
            //this.forward("/PacientServlet.java", request, response);
        //}

    }

}
