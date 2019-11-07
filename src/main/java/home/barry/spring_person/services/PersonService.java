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

    public void replacePerson(String nameOld, String infoOld, String name, String info){
        int indexPerson = personList.indexOf(findIndex(nameOld, infoOld));
        if (indexPerson != PRODUCT_NOT_PRESENT){
            personList.set(indexPerson, new Person(name, info));
        }
    }

    public void removePerson(String name, String info){
        personList.remove(findIndex(name,info));
    }

    public int findIndex(String name, String info){
        for ( int i = 0; i < personList.size(); i++){
            Person person = personList.get(i);
            if ( (person.getName().equals(name)) && (person.getInfo().equals(info))){
                return i;
            }
        }
        return PRODUCT_NOT_PRESENT;
    }
}
