package entity;

import javax.persistence.*;
import java.util.Date;
/**
 * Факт вакцинации
 */

@Entity
@Table(name = "facts_vaccination")
public class FactVaccination {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Temporal(TemporalType.DATE)
    @Column(name = "date", nullable = false)
    private Date date; //Дата вакцинации

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vaccination_id", referencedColumnName = "id")
    private Vaccination vaccinationEntity; //факт вакцинации -> вакцина

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pacient_id", referencedColumnName = "id")
    private Pacient pacientEntity; //факт вакцинации -> пациент


    public long getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Vaccination getVaccinationEntity() {
        return vaccinationEntity;
    }

    public void setVaccinationEntity(Vaccination vaccinationEntity) {
        this.vaccinationEntity = vaccinationEntity;
    }

    public Pacient getPacientEntity() {
        return pacientEntity;
    }

    public void setPacientEntity(Pacient pacientEntity) {
        this.pacientEntity = pacientEntity;
    }
}
