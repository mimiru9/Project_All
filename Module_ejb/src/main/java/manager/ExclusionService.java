package manager;

import entity.Exclusion;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 * Created by User on 16.12.2015.
 */
public class ExclusionService {

    public EntityManager em = Persistence.createEntityManagerFactory("PersistenceMed").createEntityManager();

    public Exclusion addExclusion(Exclusion exclusion){
        em.getTransaction().begin();
        Exclusion exclusionFromDB = em.merge(exclusion);
        em.getTransaction().commit();
        return exclusionFromDB;
    }

    public void deleteExclusion(long id){
        em.getTransaction().begin();
        em.remove(em.find(Exclusion.class, id));
        em.getTransaction().commit();
    }

    public void updateExclusion(Exclusion exclusion){
        em.getTransaction().begin();
        em.merge(exclusion);
        em.getTransaction().commit();
    }
}
