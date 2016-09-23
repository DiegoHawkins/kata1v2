package kata1v2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1v2 {

    public static void main(String[] args) {
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(1992,4,11);
        
        Person person = new Person("Diego"," Hawkins", date);
        System.out.println(person.getName()+ person.getSurname()+" tiene "+ person.getAge() + " años.");
    }
}
