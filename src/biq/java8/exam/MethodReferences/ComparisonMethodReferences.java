package biq.java8.exam.MethodReferences;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import biq.java8.exam.model.person.Person;


public class ComparisonMethodReferences {

    public static void main(String[] args) {
        ComparisonMethodReferences mainClass = new ComparisonMethodReferences();
        mainClass.sortData();
    }

    private void sortData() {
        List<Person> beatles = new ArrayList<>();

        beatles.add(new Person("John", 40));
        beatles.add(new Person("Paul", 72));
        beatles.add(new Person("George", 58));
        beatles.add(new Person("Ringo", 74));


/*
MethodReferences
        Method references let you reuse a method as a lambda expression.
        It’s a way to pass a method name without calling it.
        Use a method reference is done using the following syntax:
        <Where the method is found> :: <method name>
        When using a method reference, the Java complier uses Type inference to check
        if the method signature is compatible with the Functional Interface single function signature –
        if both methods signatures match then the method reference can be used.
        Using method reference allows you to implement less interfaces and just write methods
        the do the work and pass them as parameters.

        Reference to an instance method of an arbitrary object of a particular type:
            ContainingType::methodName

		*/
        PersonComparison comparison = new PersonComparison();

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
        Collections.sort(beatles, comparison::compareByAge);
    }

    public class PersonComparison {

        public int compareByAge(Person p1, Person p2) {
            Integer age1 = p1.getAge();
            return age1.compareTo(p2.getAge());
        }

    }
}
