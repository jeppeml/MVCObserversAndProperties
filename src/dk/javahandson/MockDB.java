package dk.javahandson;

import java.util.ArrayList;
import java.util.List;

public class MockDB {
    public List<Person> getAllPersons(){
        List<Person> persons = new ArrayList();
        persons.add(new Person("Anders"));
        persons.add(new Person("Peter"));
        return persons;
    }
}
