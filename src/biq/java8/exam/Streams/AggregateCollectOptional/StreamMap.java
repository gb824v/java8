package biq.java8.exam.Streams.AggregateCollectOptional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import biq.java8.exam.model.person.Person;


public class StreamMap {

    public static void main(String[] args) {
        List<Person> beatles = new ArrayList<>();

        beatles.add(new Person("John", 40));
        beatles.add(new Person("Paul", 72));
        beatles.add(new Person("George", 58));
        beatles.add(new Person("Ringo", 74));

        List<String> collect = beatles.stream().map(x -> x.getName()).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect);

    }

}
