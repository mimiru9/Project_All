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
}
