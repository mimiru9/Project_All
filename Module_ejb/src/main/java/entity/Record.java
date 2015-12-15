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

    @Column(name = "date_time", nullable = false)
    private Date dateTime;

    @Column(name = "status", nullable = false)
    @Enumerated(EnumType.STRING)
    private StatusRecordEnum status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pacient_id", referencedColumnName = "id")
    private Pacient pacientEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "doctor_id", referencedColumnName = "id")
    private Doctor doctorEntity;
}
