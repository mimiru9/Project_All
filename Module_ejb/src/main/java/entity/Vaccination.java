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
    private List<ReseptionVaccination> reseptVaccin=new ArrayList<ReseptionVaccination>(); //вакцина -> прием вакцины

    @OneToMany(mappedBy = "vaccinationEntity",fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,orphanRemoval = true)
    private List<FactVaccination> factsVaccin=new ArrayList<FactVaccination>(); //вакцина -> факт вакцинации

    @OneToMany(mappedBy = "vaccinationEntity",fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Exclusion> exclusVaccin=new ArrayList<Exclusion>(); //вакцина -> исключение на вакцину


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStartAge() {
        return startAge;
    }

    public void setStartAge(int startAge) {
        this.startAge = startAge;
    }

    public UnitsEnum getStartAgeUnit() {
        return startAgeUnit;
    }

    public void setStartAgeUnit(UnitsEnum startAgeUnit) {
        this.startAgeUnit = startAgeUnit;
    }

    public boolean isPeriod() {
        return period;
    }

    public void setPeriod(boolean period) {
        this.period = period;
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public UnitsEnum getIntervalUnit() {
        return intervalUnit;
    }

    public void setIntervalUnit(UnitsEnum intervalUnit) {
        this.intervalUnit = intervalUnit;
    }

    public int getEndAge() {
        return endAge;
    }

    public void setEndAge(int endAge) {
        this.endAge = endAge;
    }

    public UnitsEnum getEndAgeUnit() {
        return endAgeUnit;
    }

    public void setEndAgeUnit(UnitsEnum endAgeUnit) {
        this.endAgeUnit = endAgeUnit;
    }

    public List<ReseptionVaccination> getReseptVaccin() {
        return reseptVaccin;
    }

    public void setReseptVaccin(List<ReseptionVaccination> reseptVaccin) {
        this.reseptVaccin = reseptVaccin;
    }

    public List<FactVaccination> getFactsVaccin() {
        return factsVaccin;
    }

    public void setFactsVaccin(List<FactVaccination> factsVaccin) {
        this.factsVaccin = factsVaccin;
    }

    public List<Exclusion> getExclusVaccin() {
        return exclusVaccin;
    }

    public void setExclusVaccin(List<Exclusion> exclusVaccin) {
        this.exclusVaccin = exclusVaccin;
    }
}
