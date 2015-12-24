import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by User on 24.12.2015.
 */
@WebServlet(name = "WelcomeServlet", urlPatterns = {"/"})
public class WelcomeServlet extends Dispatcher {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        this.forward("/Welcome.jsp", request, response);
    }
}
