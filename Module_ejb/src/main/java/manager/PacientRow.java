package manager;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by User on 23.12.2015.
 */
public class PacientRow {
    public final String surname;
    public final String name;
    public final String patronymic;
    public final Date birthday;

    public PacientRow(String surname, String name, String patronymic, Date birthday) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthday = birthday;
    }

}
