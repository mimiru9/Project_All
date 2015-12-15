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
    @Temporal(TemporalType.TIMESTAMP)
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
    private String e_mail; //e-mail
    //private long timetable; //ссылка на расписание
    @Column(name = "speciality", nullable = false)
    private String speciality; //специальность
    @Column(name = "category", nullable = false)
    private String category; //категория

    @OneToMany(mappedBy = "doctorEntity",fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Reseption> reseptDoctor=new ArrayList<Reseption>();

    @OneToMany(mappedBy = "doctorEntity",fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Record> recordDoctor=new ArrayList<Record>();

}
