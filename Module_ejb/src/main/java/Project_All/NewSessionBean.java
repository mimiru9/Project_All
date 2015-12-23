package Project_All;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entity.GenderEnum;
import entity.Pacient;
import manager.PacientRow;
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

    public void addPacient(String surname, String name, String patronymic, String birthday, String gender,
                           String address, String phone, String eMail, String strahPolis){

        SimpleDateFormat format = new SimpleDateFormat("dd.mm.yyyy");
        try {
            Date bday = format.parse(birthday);
            GenderEnum genderEnum = GenderEnum.valueOf(gender);
            Pacient pac1 = new Pacient(surname, name, patronymic, bday, genderEnum, address, phone,eMail, strahPolis);
            service.addPacient(pac1, em);
        } catch (ParseException ex) {
            System.out.println("Это не должно произойти");
        }
    }

    public List<PacientRow> getAll(){
        return service.getAll(em);
    }
}
