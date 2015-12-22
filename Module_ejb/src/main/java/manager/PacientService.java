package manager;

import entity.*;

import javax.persistence.*;
import javax.resource.cci.ResultSet;
import java.util.Date;
import java.util.List;

/**
 * Created by User on 16.12.2015.
 */

public class PacientService {



    //private EntityManager em = Persistence.createEntityManagerFactory("PersistenceMed").createEntityManager();


    public void addPacient(Pacient pacient, EntityManager em){
        em.merge(pacient);
    }

/*    public void getAll(EntityManager em){
        List result = em.createQuery("select c from Pacient c").getResultList();
        //return result;
    }*/

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


/*    public List<Pacient> getAll(EntityManager em){
        TypedQuery<Pacient> namedQuery = em.createNamedQuery("Pacient.getAll", Pacient.class);
        return namedQuery.getResultList();
    }*/
}
