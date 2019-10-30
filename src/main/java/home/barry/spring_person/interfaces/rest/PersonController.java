package home.barry.spring_person.interfaces.rest;

import home.barry.spring_person.model.Person;
import home.barry.spring_person.services.PersonService;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/person")
public class PersonController {

    private static final Logger logger = LoggerFactory.getLogger(PersonController.class);

    @Autowired
    PersonService personService;

    @RequestMapping(value = "/add/", method = RequestMethod.POST)
    public void createUser(
            @ApiParam(value = "Name of Person", required = true)
            @RequestParam String name,
            @ApiParam(value = "Person's info", required = true)
            @RequestParam String info) {
        personService.addPerson(new Person(name, info));
        logger.info("Added new Person : " + name);
    }

    @RequestMapping(value = "/remove/", method = RequestMethod.DELETE)
    public void removeUser(
            @ApiParam(value = "Name of Person", required = true)
            @RequestParam String name,
            @ApiParam(value = "Person's info", required = true)
            @RequestParam String info) {
        personService.removePerson(name, info);
        logger.info("Removed a Person : " + name);
    }

    @RequestMapping(value = "/replace/", method = RequestMethod.POST)
    public void replaceUser(
            @ApiParam(value = "Name of Person to replace", required = true)
            @RequestParam String nameOld,
            @ApiParam(value = "Person's info to replace", required = true)
            @RequestParam String infoOld,
            @ApiParam(value = "Name of Person", required = true)
            @RequestParam String name,
            @ApiParam(value = "Person's info", required = true)
            @RequestParam String info) {
        personService.replacePerson(nameOld, infoOld, name, info);
        logger.info("Replaced Person: " + nameOld + " with new Person: " + name);
    }
}
