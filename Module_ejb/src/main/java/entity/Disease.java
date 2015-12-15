package entity;

import javax.persistence.*;

/**
 * Болезнь
 */
@Entity
@Table(name = "dieseases")
public class Disease {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "code", nullable = false)
    private String code;

    @Column(name = "nosology", nullable = false)
    private  String nosology;

}
