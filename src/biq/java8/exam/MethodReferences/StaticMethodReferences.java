package biq.java8.exam.MethodReferences;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import biq.java8.exam.model.Person;
/*
        Method references let you reuse a method as a lambda expression.
        It’s a way to pass a method name without calling it.
        Use a method reference is done using the following syntax:
        <Where the method is found> :: <method name>
*/

public class StaticMethodReferences {

    public static void main(String[] args) {
        List<Person> beatles = new ArrayList<>();

        beatles.add(new Person("John", 40));
        beatles.add(new Person("Paul", 72));
        beatles.add(new Person("George", 58));
        beatles.add(new Person("Ringo", 74));

        //option 1 - anonymous interface
        Collections.sort(beatles, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                Integer age1 = o1.getAge();
                return age1.compareTo(o2.getAge());
            }
        });

        //option 2 - Lambda expression
        Collections.sort(beatles, (p1, p2) -> {
            Integer age1 = p1.getAge();
            return age1.compareTo(p2.getAge());
        });

        //option 3 - single line Lambda expression
        Collections.sort(beatles, (p1, p2) -> new Integer(p1.getAge()).compareTo(p2.getAge()));

        //option 4 - method reference
        Collections.sort(beatles, Person::compareByAge);
    }
}