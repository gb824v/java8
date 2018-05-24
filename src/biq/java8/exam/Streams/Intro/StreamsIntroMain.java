package biq.java8.exam.Streams.Intro;


import java.util.Arrays;
import java.util.stream.Stream;

import biq.java8.exam.Lambda.Predicate.model.Person;

public class StreamsIntroMain {

    public static void main(String[] args) {
        Person[] beatles = {
            new Person("John", 40),
            new Person("Paul", 72),
            new Person("George", 58),
            new Person("Ringo", 74)
        };
        
//        //The Old way to iterate over an array
//        for (int i = 0; i < beatles.length; i++) {
//            Person.java beatle = beatles[i];
//            System.out.println(beatle);
//        }
        
        //Using a Stream - first way
//        Stream<Person.java> stream = Stream.of(beatles);
        
        //Using a Stream - second way
        Stream<Person> stream = Arrays.stream(beatles);
        
        //Iterate over the stream
        stream.forEach((p) -> System.out.println(p));
    }
}
