package manager;

import entity.Disease;
import entity.Pacient;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 * Created by User on 16.12.2015.
 */
public class DiseaseService {

    public EntityManager em = Persistence.createEntityManagerFactory("PersistenceMed").createEntityManager();

    public Disease addDisease(Disease disease){
        em.getTransaction().begin();
        Disease diseaseFromDB = em.merge(disease);
        em.getTransaction().commit();
        return diseaseFromDB;
    }

    public void deleteDisease(long id){
        em.getTransaction().begin();
        em.remove(em.find(Disease.class, id));
        em.getTransaction().commit();
    }

    public void updateDisease(Disease disease){
        em.getTransaction().begin();
        em.merge(disease);
        em.getTransaction().commit();
    }
}
