package demograpy.services;

import demograpy.models.Person;

import java.util.List;

/**
 * PersonService for CRUD operations
 *
 * Created by mahedi on 3/18/2017.
 */
public interface PersonService {
    List<Person> findAll();
    List<Person> findAllSortedByCreateTimeDesc();
    Person findById(Long pps);
    Person create(Person person);
    Person edit(Person person);
    void deleteById(Long pps);
}
