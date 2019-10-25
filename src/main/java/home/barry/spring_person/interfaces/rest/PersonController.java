package home.barry.spring_person.interfaces.rest;

import home.barry.spring_person.model.Person;
import home.barry.spring_person.services.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/person")
public class PersonController {

    private static final Logger logger = LoggerFactory.getLogger(PersonController.class);

    @Autowired
    PersonService personService;

    @RequestMapping(value = "/add/", method = RequestMethod.POST)
    public void createUser(@RequestBody Person person){
        personService.addPerson(person);
        logger.info("Added new Person : " + person.getName());
    }

    @RequestMapping(value = "/remove/", method = RequestMethod.DELETE)
    public void removeUser(@RequestBody Person person){
        personService.removePerson(person);
        logger.info("Removed a Person : " + person.getName());
    }
}
