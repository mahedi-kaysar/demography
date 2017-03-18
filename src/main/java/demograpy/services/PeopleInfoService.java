package demograpy.services;

import demograpy.models.Person;

import java.util.List;

/**
 * Created by mahedi on 3/16/2017.
 */
public interface PeopleInfoService {
    /**
     * Find all the persons in DB
     *
     * @return list of persons
     */
    List<Person> findAll();

    /**
     * Adding a new person
     * @param person
     * @return person
     */
    Person add(Person person);

    /**
     * This method return a person searching pps.
     *
     * @param pps
     * @return person
     */
    Person findByPPS(String pps);
}
