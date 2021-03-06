package biq.java8.exam.Streams.AggregateCollectOptional;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

import biq.java8.exam.model.person.Person;


public class AverageMaxSum {

    public static void main(String[] args) {
        List<Person> beatles = new ArrayList<>();

        beatles.add(new Person("John", 40));
        beatles.add(new Person("Paul", 72));
        beatles.add(new Person("George", 58));
        beatles.add(new Person("Ringo", 74));

        //sum of ages
        long sum = beatles.stream().mapToInt(Person::getAge).sum(); //return a stream of int
        System.out.println("Sum of ages = " + sum);

        //if the stream is empty
        OptionalDouble avg = beatles.stream().mapToInt((p) -> p.getAge()).average();
        OptionalInt max = beatles.stream().mapToInt((p) -> p.getAge()).max();

        //option 1 - check if there is a value
        if (avg.isPresent()) {
            System.out.println("Average of ages = " + avg.getAsDouble());
        }

        //option 2 - use a Lambda!
        avg.ifPresent(AverageMaxSum::printAverage);
    }

    static private void printAverage(double average) {
        System.out.println("Average of ages = " + average);
    }
}
