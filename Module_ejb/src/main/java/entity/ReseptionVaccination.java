package entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Прием вакцины
 */
@Entity
@Table(name = "reseptions_vaccinations")
public class ReseptionVaccination {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Temporal(TemporalType.DATE)
    @Column(name = "date_in", nullable = false)
    private Date dateIn; //дата приема

    @Column(name = "count", nullable = false)
    private int count; //количество (мл)

    @Temporal(TemporalType.DATE)
    @Column(name = "expiration_date", nullable = false)
    private Date expirationDate; //срок годности

    @Column(name = "seria")
    private String seria; //серия

    @Column(name = "manufacturer")
    private String manufacturer; //производитель

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vaccination_id", referencedColumnName = "id")
    private Vaccination vaccinationEntity; //прием вакцины -> вакцина


    public long getId() {
        return id;
    }

    public Date getDateIn() {
        return dateIn;
    }

    public void setDateIn(Date dateIn) {
        this.dateIn = dateIn;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getSeria() {
        return seria;
    }

    public void setSeria(String seria) {
        this.seria = seria;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Vaccination getVaccinationEntity() {
        return vaccinationEntity;
    }

    public void setVaccinationEntity(Vaccination vaccinationEntity) {
        this.vaccinationEntity = vaccinationEntity;
    }
}
