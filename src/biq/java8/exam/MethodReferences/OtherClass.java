package biq.java8.exam.MethodReferences;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import biq.java8.exam.Lambda.Predicate.model.Person;

/**
 * @author blechl
 */
public class OtherClass {
    public void foo() {
        SuperSpecialPersonComparison obj = new SuperSpecialPersonComparison();

        List<Person> beatles = new ArrayList<>();

        beatles.add(new Person("John", 40));
        beatles.add(new Person("Paul", 72));
        beatles.add(new Person("George", 58));
        beatles.add(new Person("Ringo", 74));

        Collections.sort(beatles, obj::compareByAge);
    }
}
