package biq.java8.exam.Streams.AggregateCollectOptional;

import java.util.ArrayList;
import java.util.List;

import biq.java8.exam.model.person.Person;


public class StreamMapToInt {

    public static void main(String[] args) {
        List<Person> beatles = new ArrayList<>();

        beatles.add(new Person("John", 40));
        beatles.add(new Person("Paul", 72));
        beatles.add(new Person("George", 58));
        beatles.add(new Person("Ringo", 74));

        //mapToInt return a stream of int
        int sum = beatles.stream().mapToInt(Person::getAge).sum(); //return a stream of int
        long sumLong = beatles.stream().mapToLong(Person::getAge).sum();

    }

}
