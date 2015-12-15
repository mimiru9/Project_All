package entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Врач
 */
@Entity
@Table(name= "doctors")
public class Doctor {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "suranme", nullable = false)
    private String surname;    //Фамилия пациента
    @Column(name = "name", nullable = false)
    private String name;      //Имя пациента
    @Column(name = "patronymic", nullable = false)
    private String patronymic; //Отчетство пациента
    @Temporal(TemporalType.DATE)
    @Column(name = "birthday", nullable = false)
    private Date birthday; //дата рождения
    @Column(name = "gender", nullable = false)
    @Enumerated(EnumType.STRING)
    private GenderEnum gender;
    @Column(name = "address", nullable = false)
    private String address; //адрес
    @Column(name = "phone")
    private String phone; //телефон
    @Column(name = "e_mail")
    private String eMail; //e-mail
    //private long timetable; //ссылка на расписание
    @Column(name = "speciality", nullable = false)
    private String speciality; //специальность
    @Column(name = "category", nullable = false)
    private String category; //категория

    @OneToMany(mappedBy = "doctorEntity",fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Reseption> reseptDoctor=new ArrayList<Reseption>(); //доктор -> прием пациента

    @OneToMany(mappedBy = "doctorEntity",fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Record> recordDoctor=new ArrayList<Record>(); //доктор -> запись


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

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<Reseption> getReseptDoctor() {
        return reseptDoctor;
    }

    public void setReseptDoctor(List<Reseption> reseptDoctor) {
        this.reseptDoctor = reseptDoctor;
    }

    public List<Record> getRecordDoctor() {
        return recordDoctor;
    }

    public void setRecordDoctor(List<Record> recordDoctor) {
        this.recordDoctor = recordDoctor;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
}
