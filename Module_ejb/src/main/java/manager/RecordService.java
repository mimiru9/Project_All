package manager;

import entity.Record;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 * Created by User on 16.12.2015.
 */
public class RecordService {

    public EntityManager em = Persistence.createEntityManagerFactory("PersistenceMed").createEntityManager();

    public Record addRecord(Record record){
        em.getTransaction().begin();
        Record recordFromDB = em.merge(record);
        em.getTransaction().commit();
        return recordFromDB;
    }

    public void deleteRecord(long id){
        em.getTransaction().begin();
        em.remove(em.find(Record.class, id));
        em.getTransaction().commit();
    }

    public void updateRecord(Record record){
        em.getTransaction().begin();
        em.merge(record);
        em.getTransaction().commit();
    }
}
