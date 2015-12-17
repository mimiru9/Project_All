package manager;

import entity.Reseption;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 * Created by User on 16.12.2015.
 */
public class ReseptionService {

    public EntityManager em = Persistence.createEntityManagerFactory("PersistenceMed").createEntityManager();

    public Reseption addReseption(Reseption reseption){
        em.getTransaction().begin();
        Reseption reseptionFromDB = em.merge(reseption);
        em.getTransaction().commit();
        return reseptionFromDB;
    }

    public void deleteReseption(long id){
        em.getTransaction().begin();
        em.remove(em.find(Reseption.class, id));
        em.getTransaction().commit();
    }

    public void updateReseption(Reseption reseption){
        em.getTransaction().begin();
        em.merge(reseption);
        em.getTransaction().commit();
    }
}
