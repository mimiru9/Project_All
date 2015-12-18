package Project_All;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date;
import java.util.List;

import entity.Pacient;
import manager.PacientService;

/**
 * Created by User on 09.12.2015.
 */
@Stateless
public class NewSessionBean {

    @PersistenceContext(name = "PersistenceMed")
    EntityManager em;

    private PacientService service = new PacientService();

    public Date get_time() {
        Date currentDate = new Date();
        return currentDate;
    }

    public void addPacient(String surname, String name){

        Pacient pac1 = new Pacient(surname, name);
        //Записали в БД
        service.addPacient(pac1, em);

    }

}
