package olga.zalozhenkova.testvalidation.service;

import olga.zalozhenkova.testvalidation.PeopleRepository.PeopleRepository;
import olga.zalozhenkova.testvalidation.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PeopleService {
    private final PeopleRepository peopleRepository;

    @Autowired
    public PeopleService(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    @Transactional
    public void save(Person person) {
        peopleRepository.save(person);
    }

}
