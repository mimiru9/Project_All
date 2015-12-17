package manager;

import entity.Doctor;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 * Created by User on 16.12.2015.
 */
public class DoctorService {

    public EntityManager em = Persistence.createEntityManagerFactory("PersistenceMed").createEntityManager();

    public Doctor addDoctor(Doctor doctor){
        em.getTransaction().begin();
        Doctor doctorFromDB = em.merge(doctor);
        em.getTransaction().commit();
        return doctorFromDB;
    }

    public void deleteDoctor(long id){
        em.getTransaction().begin();
        em.remove(em.find(Doctor.class, id));
        em.getTransaction().commit();
    }

    public void updateDoctor(Doctor doctor){
        em.getTransaction().begin();
        em.merge(doctor);
        em.getTransaction().commit();
    }
}
