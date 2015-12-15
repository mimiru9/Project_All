package entity;

import javax.persistence.*;

/**
 * Исключение для пациента на вакцину
 */

@Entity
@Table(name = "exclusions")
public class Exclusion {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="view_ex")
    private String viewEx;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vaccination_id", referencedColumnName = "id")
    private Vaccination vaccinationEntity; //исключение -> вакцина

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pacient_id", referencedColumnName = "id")
    private Pacient pacientEntity; //исключние -> пациент


    public long getId() {
        return id;
    }

    public String getViewEx() {
        return viewEx;
    }

    public void setViewEx(String viewEx) {
        this.viewEx = viewEx;
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
