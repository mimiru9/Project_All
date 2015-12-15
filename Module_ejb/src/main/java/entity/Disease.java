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


    public long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNosology() {
        return nosology;
    }

    public void setNosology(String nosology) {
        this.nosology = nosology;
    }
}
