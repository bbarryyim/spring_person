package home.barry.spring_person.services;

import home.barry.spring_person.model.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonService {

    List<Person> personList = new ArrayList<>();

    public void addPerson(Person person){
        personList.add(person);
    }

    public void removePerson(Person person){
        personList.remove(person);
    }

}
