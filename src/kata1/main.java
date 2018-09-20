package kata1;

import java.util.Date;

/**
 *
 * @author Andres
 */
public class main {

    public static void main(String[] args) {
        Person person = new Person("Blas", new Date(49,8,24));
        System.out.println(person.getName() + " tiene " + person.getAge());
    }
    
}
