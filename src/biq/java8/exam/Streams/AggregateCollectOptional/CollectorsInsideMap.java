package biq.java8.exam.Streams.AggregateCollectOptional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import biq.java8.exam.model.person.Person;


public class CollectorsInsideMap {

    public static void main(String[] args) {
        List<Person> beatles = new ArrayList<>();

        beatles.add(new Person("John", 40));
        beatles.add(new Person("Paul", 72));
        beatles.add(new Person("George", 58));
        beatles.add(new Person("Ringo", 74));

        // convert inside the map() method directly.
        List<Person> result = beatles.stream().map(temp ->
        {
            if ("Paul".equals(temp.getName())) {
                temp.setAge(100);
            }
            return temp;
        }).collect(Collectors.toList());

        System.out.println(result);

    }

}
