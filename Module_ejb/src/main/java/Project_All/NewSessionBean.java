package Project_All;

import javax.ejb.Stateless;
import java.util.Date;

import entity.Pacient;
import manager.PacientService;

/**
 * Created by User on 09.12.2015.
 */
@Stateless
public class NewSessionBean {

    public Date get_time() {
        Date currentDate = new Date();
        return currentDate;
    }

    public void testSaveRecord(){

        PacientService service = new PacientService();
        Pacient pac1 = new Pacient();
        pac1.setName("Mona");
        //Записали в БД
        Pacient pac = service.addPacient(pac1);
    }
}
