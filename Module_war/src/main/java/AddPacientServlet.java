import Project_All.NewSessionBean;
import entity.GenderEnum;
import entity.GenderEnumRus;
import entity.Pacient;
import manager.EnumService;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 09.12.2015.
 */

@WebServlet(name = "AddPacientServlet", urlPatterns = {"/pacient/add_pacient"})
public class AddPacientServlet extends Dispatcher{
    @EJB
    private NewSessionBean bean;


/*    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");

        //SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
        //req.setAttribute("date123", sdf.format(bean.get_time()));

        this.forward("/AddPacient.jsp", request, response);

    }*/

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException,IOException{
        response.setContentType("text/html");

        List<EnumService> emunList = new ArrayList<EnumService>();

        for(int i=0; i<GenderEnum.values().length; i++){
            emunList.add(new EnumService(GenderEnum.values()[i].name(), GenderEnumRus.values()[i].name()));
        }
        request.setAttribute("enum", emunList);

        this.forward("/AddPacient.jsp", request, response);
    }
    }

