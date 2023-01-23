package ru.borbot.springcourse.dao;

import org.springframework.stereotype.Component;
import ru.borbot.springcourse.models.Person;

import java.util.ArrayList;
import java.util.List;
@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;
     private List<Person> people;

    {
        people =new ArrayList<>();
        people.add(new Person(++PEOPLE_COUNT,"Jek"));
        people.add(new Person(++PEOPLE_COUNT,"Arni"));
        people.add(new Person(++PEOPLE_COUNT,"Zit"));
        people.add(new Person(++PEOPLE_COUNT,"Guk"));
    }
    public List<Person> peopleList(){
        return people;
    }
    public  Person peopleID(int id){
        return people.stream().filter(person -> person.getId()==id).findAny().orElse(null);
    }
}
