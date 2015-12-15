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

}
