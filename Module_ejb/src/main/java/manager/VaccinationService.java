package manager;

import entity.Vaccination;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 * Created by User on 16.12.2015.
 */
public class VaccinationService {

    public EntityManager em = Persistence.createEntityManagerFactory("PersistenceMed").createEntityManager();

    public Vaccination addVaccination(Vaccination vaccination){
        em.getTransaction().begin();
        Vaccination vaccinationFromDB = em.merge(vaccination);
        em.getTransaction().commit();
        return vaccinationFromDB;
    }

    public void deleteVaccination(long id){
        em.getTransaction().begin();
        em.remove(em.find(Vaccination.class, id));
        em.getTransaction().commit();
    }

    public void updateVaccination(Vaccination vaccination){
        em.getTransaction().begin();
        em.merge(vaccination);
        em.getTransaction().commit();
    }
}
