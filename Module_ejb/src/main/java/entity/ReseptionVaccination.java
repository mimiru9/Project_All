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

    @Column(name = "date_in", nullable = false)
    private Date dateIn; //дата приема

    @Column(name = "count", nullable = false)
    private int count; //количество (мл)

    @Column(name = "expiration_date", nullable = false)
    private Date expirationDate; //срок годности

    @Column(name = "seria")
    private String seria; //серия

    @Column(name = "manufacturer")
    private String manufacturer; //производитель

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vaccination_id", referencedColumnName = "id")
    private Vaccination vaccinationEntity;

}
