package biq.java8.exam.Lambda.Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import biq.java8.exam.Lambda.Predicate.model.Person;
/*
		The java.util.function Package contains new Function Interfaces which in combination with
			JCF (Java Collection Framework) and other new classes enables easier and shorter code.
        Predicate<T>
        Determine if the input of type T matches some criteria (return true/false)
        Consumer<T>
        Accept a single input argument of type T, and return no result (e.g. for each... )
        Function<T, R>
        Apply a function to the input type T, generating a result of type R
        Plus several more
*/

public class PredicateMain {

    public static void main(String args[]) {
        List<Person> beatles = new ArrayList<>();

        beatles.add(new Person("John", 40));
        beatles.add(new Person("Paul", 72));
        beatles.add(new Person("George", 58));
        beatles.add(new Person("Ringo", 74));

        Predicate<Person> ageCondition = new Predicate<Person>() {
            @Override
            public boolean test(Person t) {
                if (t.getAge() > 70) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        //Long way with Lambda
        Predicate<Person> agePredicate = (Person t) -> {
            if (t.getAge() > 70) {
                return true;
            } else {
                return false;
            }
        };
        //Short way with Lambda
        Predicate<Person> agePredicate1 = (person) -> person.getAge() > 70;
        //Long way to print
        for (Person beatle : beatles) {
            if (agePredicate.test(beatle)) {
                System.out.println(beatle);
            }
        }
        //Short way to print with Lambda
        beatles.forEach(p -> {
            if (agePredicate1.test(p)) {
                System.out.println(p);
            }
        });
    }
}
