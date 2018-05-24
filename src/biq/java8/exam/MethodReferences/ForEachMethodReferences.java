package biq.java8.exam.MethodReferences;
import java.util.ArrayList;
import java.util.List;

public class ForEachMethodReferences {

    public static void main(String[] args) {
        List<String> myString = new ArrayList<>();
        myString.add("AAA");
        myString.add("bbb");
        myString.add("CCC");
        myString.add("ddd");
        myString.add("EEE");

        //remove {} if one line in body
        myString.forEach((str) -> System.out.println(str));

        myString.forEach(str -> System.out.println(str));

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

        myString.forEach(System.out::println); //=> myString.forEach(str -> System.out.println(str))
    }
}