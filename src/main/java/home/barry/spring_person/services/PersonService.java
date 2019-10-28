package home.barry.spring_person.services;

import home.barry.spring_person.model.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonService {

    public static final int PRODUCT_NOT_PRESENT = -1;

    List<Person> personList = new ArrayList<>();

    public void addPerson(Person person){
        personList.add(person);
    }

    public void replacePerson(Person oldPerson, Person newPerson){
        int indexPerson = personList.indexOf(oldPerson);
        if (indexPerson != PRODUCT_NOT_PRESENT){
            personList.set(indexPerson, newPerson);
        }
    }

    public void removePerson(String name, String info){
        personList.indexOf(findIndex(name,info));
    }

    public int findIndex(String name, String info){
        for ( int i = 0; i < personList.size(); i++){
            Person person = personList.get(i);
            if ( (person.getName() == name) && (person.getInfo() == info)){
                return i;
            }
        }
        return PRODUCT_NOT_PRESENT;
    }
}
