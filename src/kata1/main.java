package kata1;

import java.time.LocalDate;



/**
 *
 * @author Andres
 */
public class main {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1997, 9, 29);
        
        Person person = new Person("Blas",date);
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
    }
    
}
