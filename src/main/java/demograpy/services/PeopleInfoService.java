package demograpy.services;

import demograpy.models.Person;

import java.util.List;

/**
 * Created by mahedi on 3/16/2017.
 */
public interface PeopleInfoService {
    List<Person> findAll();
    Person add(Person person);
}
