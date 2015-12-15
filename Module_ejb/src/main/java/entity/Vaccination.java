package entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Вакцина
 */

@Entity
@Table(name = "vaccinations")
public class Vaccination {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "name", nullable = false)
    private String name; //название вакцины
    @Column(name = "start_age", nullable = false)
    private int startAge; //возраст начала
    @Column(name = "start_age_unit", nullable = false)
    @Enumerated(EnumType.STRING)
    private UnitsEnum startAgeUnit; //единицы возраста
    @Column(name = "period", nullable = false)
    private boolean period; //периодичность
    @Column(name = "interval")
    private int interval; //интервал
    @Column(name = "interval_unit")
    @Enumerated(EnumType.STRING)
    private UnitsEnum intervalUnit;
    @Column(name = "end_age")
    private int endAge; //возраст конца
    @Column(name = "end_age_unit")
    @Enumerated(EnumType.STRING)
    private UnitsEnum endAgeUnit;
    @OneToMany(mappedBy = "vaccinationEntity",fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,orphanRemoval = true)
    private List<ReseptionVaccination> reseptVaccin=new ArrayList<ReseptionVaccination>();

    @OneToMany(mappedBy = "vaccinationEntity",fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,orphanRemoval = true)
    private List<FactVaccination> factsVaccin=new ArrayList<FactVaccination>();

    @OneToMany(mappedBy = "vaccinationEntity",fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Exclusion> exclusVaccin=new ArrayList<Exclusion>();

}
