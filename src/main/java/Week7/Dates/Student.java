package Week7.Dates;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student {

    String name;
    Date registrationDay;

    //  store date

    public Student(String name) {
        this.name = name;
        this.registrationDay = new Date();
    }
}
