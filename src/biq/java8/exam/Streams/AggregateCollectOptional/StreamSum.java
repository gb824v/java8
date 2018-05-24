package biq.java8.exam.Streams.AggregateCollectOptional;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import biq.java8.exam.model.person.Person;


public class StreamSum {

    public static void main(String[] args) {
        List<Person> beatles = new ArrayList<>();

        beatles.add(new Person("John", 40));
        beatles.add(new Person("Paul", 72));
        beatles.add(new Person("George", 58));
        beatles.add(new Person("Ringo", 74));

        //sum of ages
        long sum = beatles.stream().mapToInt(Person::getAge).sum(); //return a stream of int
        System.out.println("Sum of ages = " + sum);
        int total = 100;


        Random r = new Random();
        Instant start = Instant.now();
        List<Integer> result = IntStream
                .generate(() -> r.nextInt(100))
                .limit(total)
                .boxed()
                .collect(Collectors.toList());
        Instant end = Instant.now();


        start = Instant.now();

//        ArrayList<E> result = input
//                .stream()
//                .sorted()
//                .collect(Collectors.toCollection(ArrayList::new));
    }

}
