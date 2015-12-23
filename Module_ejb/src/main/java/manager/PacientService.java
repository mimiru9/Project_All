package manager;

import entity.*;

import javax.persistence.*;
import javax.resource.cci.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by User on 16.12.2015.
 */

public class PacientService {

    public void addPacient(Pacient pacient, EntityManager em) {
        em.merge(pacient);
    }

    public List<PacientRow> getAll(EntityManager em) {

        List<PacientRow> ret = new ArrayList<PacientRow>();
        TypedQuery<PacientRow> query = em.createQuery("select new manager.PacientRow(surname, name, patronymic, birthday) from Pacient", PacientRow.class);
        List<PacientRow> list = query.getResultList();
        for (PacientRow pacRow : list) {
            ret.add(pacRow);
        }
        return ret;
    }

    /*public void deletePacient(long id){
        em.getTransaction().begin();
        em.remove(em.find(Pacient.class, id));
        em.getTransaction().commit();
    }

    public void updatePacient(Pacient pacient){
        em.getTransaction().begin();
        em.merge(pacient);
        em.getTransaction().commit();
    }*/
}
