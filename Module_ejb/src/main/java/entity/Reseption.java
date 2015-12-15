package entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Прием пациента
 */
@Entity
@Table(name = "reseptions")
public class Reseption {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date_view", nullable = false)
    private Date dateView; //дата осмотра

    @Column(name = "form_view")
    @Enumerated(EnumType.STRING)
    private FormViewEnum formView; //форма осмотра
    @Column(name = "sentEnum")
    @Enumerated(EnumType.STRING)
    private SentEnum sent; //направление

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pacient_id", referencedColumnName = "id")
    private Pacient pacientEntity; //прием -> пациент

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "doctor_id", referencedColumnName = "id")
    private Doctor doctorEntity; //прием -> доктор

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "reseption_disease",
            joinColumns = {@JoinColumn(name = "reseption_id")},
            inverseJoinColumns = {@JoinColumn(name = "disease_id")})
    private List<Disease> diseasesResept=new ArrayList<Disease>(); //прием -> болезнь


    public long getId() {
        return id;
    }

    public Date getDateView() {
        return dateView;
    }

    public void setDateView(Date dateView) {
        this.dateView = dateView;
    }

    public FormViewEnum getFormView() {
        return formView;
    }

    public void setFormView(FormViewEnum formView) {
        this.formView = formView;
    }

    public SentEnum getSent() {
        return sent;
    }

    public void setSent(SentEnum sent) {
        this.sent = sent;
    }

    public Pacient getPacientEntity() {
        return pacientEntity;
    }

    public void setPacientEntity(Pacient pacientEntity) {
        this.pacientEntity = pacientEntity;
    }

    public Doctor getDoctorEntity() {
        return doctorEntity;
    }

    public void setDoctorEntity(Doctor doctorEntity) {
        this.doctorEntity = doctorEntity;
    }

    public List<Disease> getDiseasesResept() {
        return diseasesResept;
    }

    public void setDiseasesResept(List<Disease> diseasesResept) {
        this.diseasesResept = diseasesResept;
    }
}
