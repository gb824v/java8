package biq.java8.exam.MethodReferences;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
        Method references let you reuse a method as a lambda expression.
        It’s a way to pass a method name without calling it.
        Use a method reference is done using the following syntax:
        <Where the method is found> :: <method name>
*/

import biq.java8.exam.Lambda.Predicate.model.Person;

public class MainMReferencesComparison {

    public static void main(String[] args) {
        MainMReferencesComparison mainClass = new MainMReferencesComparison();
        mainClass.sortData();
    }

    private void sortData() {
        List<Person> beatles = new ArrayList<>();

        beatles.add(new Person("John", 40));
        beatles.add(new Person("Paul", 72));
        beatles.add(new Person("George", 58));
        beatles.add(new Person("Ringo", 74));

        SuperSpecialPersonComparison comparison = new SuperSpecialPersonComparison();
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

        forEach(Consumer<T>)
        Consumer<T> = Accept a single input argument of type T, and return no result
        In this case get string and no results only print;

		*/
        Collections.sort(beatles, comparison::compareByAge);
    }


}
