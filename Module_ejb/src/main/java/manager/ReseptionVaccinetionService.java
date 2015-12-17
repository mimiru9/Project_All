package manager;

import entity.ReseptionVaccination;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 * Created by User on 16.12.2015.
 */
public class ReseptionVaccinetionService {

    public EntityManager em = Persistence.createEntityManagerFactory("PersistenceMed").createEntityManager();

    public ReseptionVaccination addReseptionVaccination(ReseptionVaccination reseptionVaccination){
        em.getTransaction().begin();
        ReseptionVaccination reseptionVaccinationFromDB = em.merge(reseptionVaccination);
        em.getTransaction().commit();
        return reseptionVaccinationFromDB;
    }

    public void deleteReseptionVaccination(long id){
        em.getTransaction().begin();
        em.remove(em.find(ReseptionVaccination.class, id));
        em.getTransaction().commit();
    }

    public void updateReseptionVaccination(ReseptionVaccination reseptionVaccination){
        em.getTransaction().begin();
        em.merge(reseptionVaccination);
        em.getTransaction().commit();
    }
}
