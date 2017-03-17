package demograpy.services;

import demograpy.models.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by mahedi on 3/16/2017.
 */
@Service
public class PeopleInfoServiceStubImpl implements PeopleInfoService {

    private List<Person> persons = new ArrayList<Person>(){{
        Calendar cal1 = Calendar.getInstance();
        cal1.set(1988,11,30);
        add(new Person("Mahedi","100001",cal1.getTime(),"0899641664"));
        Calendar cal2 = Calendar.getInstance();
        cal2.set(1988,12,21);
        add(new Person("Kaysar","100002",cal2.getTime(),"0894736796"));
    }};

    @Override
    public List<Person> findAll() {
        return this.persons;
    }

    @Override
    public Person add(Person person) {
        this.persons.add(person);
        return person;
    }

    @Override
    public Person findByPPS(String pps) {
        List<Person> personsbyPPS = this.persons.stream().filter(p->p.getPps().equals(pps)).collect(Collectors.toList());
        if(personsbyPPS.size()==1)
            return personsbyPPS.get(0);
        return null;
    }
}
