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
//@NamedQuery(name = "entity.Pacient.getAll", query = "SELECT c from entity.Pacient c")
public class Pacient {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "surname", nullable = false)
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
    private String eMail; //e-mail
    @Column(name = "strah_polis", nullable = false)
    private String strahPolis; //страховой полис
    //private long comforTime; //ссылка на комфортное время

    @OneToMany(mappedBy = "pacientEntity",fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Exclusion> exclusPatient=new ArrayList<Exclusion>();

    @OneToMany(mappedBy = "pacientEntity",fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,orphanRemoval = true)
    private List<FactVaccination> factsPatient=new ArrayList<FactVaccination>();

    @OneToMany(mappedBy = "pacientEntity",fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Reseption> reseptPacient=new ArrayList<Reseption>();

    @OneToMany(mappedBy = "pacientEntity",fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Record> recordPacient=new ArrayList<Record>();

}
