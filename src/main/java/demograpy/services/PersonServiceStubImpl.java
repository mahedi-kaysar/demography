package demograpy.services;

import demograpy.models.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by mahedi on 3/16/2017.
 */
@Service
public class PersonServiceStubImpl implements PersonService{

    private List<Person> persons = new ArrayList<Person>(){{
        Calendar cal1 = Calendar.getInstance();
        cal1.set(1988,11,30);
        add(new Person("Mahedi",12345,cal1.getTime(),"0899641664"));
        Calendar cal2 = Calendar.getInstance();
        cal2.set(1988,12,21);
        add(new Person("Kaysar",12346,cal2.getTime(),"0894736796"));
    }};

    @Override
    public List<Person> findAll() {
        return this.persons;
    }

    @Override
    public Person add(Person person) {
        System.out.println(person.getName()+"==============add");
        Calendar cal1 = Calendar.getInstance();
        cal1.set(1988,11,30);
        person.setBirthday(cal1.getTime());
        person.setPps(this.persons.stream().mapToInt(p->p.getPps()).max().getAsInt()+1);
        this.persons.add(person);
        return person;
    }

}
