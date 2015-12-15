package entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Запись
 */
@Entity
@Table(name = "records")
public class Record {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date_time", nullable = false)
    private Date dateTime; // дата и время будующего приема

    @Column(name = "status", nullable = false)
    @Enumerated(EnumType.STRING)
    private StatusRecordEnum status; //статус записи

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pacient_id", referencedColumnName = "id")
    private Pacient pacientEntity; //запись -> пациент

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "doctor_id", referencedColumnName = "id")
    private Doctor doctorEntity; //запись -> доктор


    public long getId() {
        return id;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public StatusRecordEnum getStatus() {
        return status;
    }

    public void setStatus(StatusRecordEnum status) {
        this.status = status;
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
}
