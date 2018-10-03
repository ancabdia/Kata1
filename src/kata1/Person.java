package kata1;

import java.time.LocalDate;
import java.time.Period;
//import java.util.Calendar;
//import java.util.GregorianCalendar;
//import java.util.Date;

/**
 *
 * @author Andres
 */
public class Person {
    private final String name;
    private LocalDate birthDate;
    
    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }
    
    public int getAge(){
        return Period.between(birthDate, LocalDate.now()).getYears();
    }
}