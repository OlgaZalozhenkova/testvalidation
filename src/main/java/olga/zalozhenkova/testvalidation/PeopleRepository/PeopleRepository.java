package olga.zalozhenkova.testvalidation.PeopleRepository;

import olga.zalozhenkova.testvalidation.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {

}
