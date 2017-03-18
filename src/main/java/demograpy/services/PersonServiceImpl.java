package demograpy.services;

import demograpy.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mahedi on 3/18/2017.
 */
@Service
@Primary
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonRepository personRepository;

    @Override
    public List<Person> findAll() {
        return this.personRepository.findAll();
    }

    @Override
    public List<Person> findAllSortedByCreateTimeDesc() {
        return this.personRepository.findAll(orderBy());
    }
    private Sort orderBy(){
        return new Sort(Sort.Direction.DESC,"createTime");
    }
    @Override
    public Person findById(Long pps) {
        return this.personRepository.findOne(pps);
    }

    @Override
    public Person create(Person person) {
        return this.personRepository.save(person);
    }

    @Override
    public Person edit(Person person) {
        return this.personRepository.save(person);
    }

    @Override
    public void deleteById(Long pps) {
        this.personRepository.delete(pps);
    }
}
