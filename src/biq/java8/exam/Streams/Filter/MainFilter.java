package biq.java8.exam.Streams.Filter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

import biq.java8.exam.model.person.Person;


public class MainFilter {

    public static void main(String[] args) {
        List<Person> beatles = new ArrayList<>();

        beatles.add(new Person("John", 40));
        beatles.add(new Person("Paul", 72));
        beatles.add(new Person("George", 58));
        beatles.add(new Person("Ringo", 74));

        Predicate<Person> agePredicate = (p) -> p.getAge() > 70;
        displayPeople(beatles, agePredicate);
    }

    private static boolean deadPerson(Person person) {
        return person.getAge() < 70;
    }

    private static void displayPeople(Collection<Person> people, Predicate<Person> condition) {

        //Option 1 Lambda ForEach
        people.forEach((p) -> {
            if (condition.test(p)) {
                System.out.println(p);
            }
        });

        //Option 2 Stream ForEach
        people.stream().filter(condition).forEach(System.out::println);
    }
}
