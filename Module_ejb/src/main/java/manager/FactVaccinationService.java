package manager;

import entity.FactVaccination;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 * Created by User on 16.12.2015.
 */
public class FactVaccinationService {

    public EntityManager em = Persistence.createEntityManagerFactory("PersistenceMed").createEntityManager();

    public FactVaccination addFactVaccination(FactVaccination factVaccination){
        em.getTransaction().begin();
        FactVaccination factVaccinationFromDB = em.merge(factVaccination);
        em.getTransaction().commit();
        return factVaccinationFromDB;
    }

    public void deleteFactVaccination(long id){
        em.getTransaction().begin();
        em.remove(em.find(FactVaccination.class, id));
        em.getTransaction().commit();
    }

    public void updateFactVaccination(FactVaccination factVaccination){
        em.getTransaction().begin();
        em.merge(factVaccination);
        em.getTransaction().commit();
    }
}
