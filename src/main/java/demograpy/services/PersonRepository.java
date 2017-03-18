package demograpy.services;

import demograpy.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by mahedi on 3/18/2017.
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
