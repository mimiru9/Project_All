package entity;

/**
 * Пациент
 */

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "pacients")
//@NamedQuery(name = "Pacient.getAll", query = "SELECT c from pacients c")
public class Pacient {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "surname"/*, nullable = false*/)
    private String surname;    //Фамилия пациента
    @Column(name = "name"/*, nullable = false*/)
    private String name;      //Имя пациента
    @Column(name = "patronymic"/*, nullable = false*/)
    private String patronymic; //Отчетство пациента
    @Temporal(TemporalType.DATE)
    @Column(name = "birthday"/*, nullable = false*/)
    private Date birthday; //дата рождения
    @Column(name = "gender"/*, nullable = false*/)
    @Enumerated(EnumType.STRING)
    private GenderEnum gender; //пол
    @Column(name = "address"/*, nullable = false*/)
    private String address; //адрес
    @Column(name = "phone")
    private String phone; //телефон
    @Column(name = "e_mail")
    private String eMail; //e-mail
    @Column(name = "strah_polis"/*, nullable = false*/)
    private String strahPolis; //страховой полис
    //private long comforTime; //ссылка на комфортное время

    @OneToMany(mappedBy = "pacientEntity", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Exclusion> exclusPatient = new ArrayList<Exclusion>(); //пациент -> исключение

    @OneToMany(mappedBy = "pacientEntity", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL, orphanRemoval = true)
    private List<FactVaccination> factsPatient = new ArrayList<FactVaccination>(); //пациент -> факт вакцинации

    @OneToMany(mappedBy = "pacientEntity", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Reseption> reseptPacient = new ArrayList<Reseption>(); //пациент -> прием

    @OneToMany(mappedBy = "pacientEntity", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Record> recordPacient = new ArrayList<Record>(); //пациент -> запись


    public long getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public GenderEnum getGender() {
        return gender;
    }

    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStrahPolis() {
        return strahPolis;
    }

    public void setStrahPolis(String strahPolis) {
        this.strahPolis = strahPolis;
    }

    public List<Exclusion> getExclusPatient() {
        return exclusPatient;
    }

    public void setExclusPatient(List<Exclusion> exclusPatient) {
        this.exclusPatient = exclusPatient;
    }

    public List<FactVaccination> getFactsPatient() {
        return factsPatient;
    }

    public void setFactsPatient(List<FactVaccination> factsPatient) {
        this.factsPatient = factsPatient;
    }

    public List<Reseption> getReseptPacient() {
        return reseptPacient;
    }

    public void setReseptPacient(List<Reseption> reseptPacient) {
        this.reseptPacient = reseptPacient;
    }

    public List<Record> getRecordPacient() {
        return recordPacient;
    }

    public void setRecordPacient(List<Record> recordPacient) {
        this.recordPacient = recordPacient;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public Pacient(String suraname, String name){
        this.setSurname(suraname);
        this.setName(name);
    }

    public Pacient(){

    }

}
