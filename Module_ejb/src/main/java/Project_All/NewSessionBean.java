package Project_All;

import javax.ejb.Stateless;
import java.util.Date;

/**
 * Created by User on 09.12.2015.
 */
@Stateless(name = "NewSessionEJB")
public class NewSessionBean {
    public Date get_time() {
        Date currentDate = new Date();
        return currentDate;
    }
}
