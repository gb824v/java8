package biq.java8.exam.Streams.Intro;


import java.util.stream.Stream;

import biq.java8.exam.Lambda.Predicate.model.Person;
/*
    Streams (not to be confused with I/O Streams) are a new way in Java to work with
    Collections of items without the need to iterate over each item individually.
    Works with Collections (List, Set, Map, etc.) and with Arrays – but they are NOT data structures on their own.
    Enables easy operations such as sum, average, count, max, min, filter, map and more on items.
    Also – enables easy, simple parallel operations without the need to explicitly work with Threads.

    A stream can be infinite (for example: a stream of random numbers does not need to end).
    In the same way that it is very easy to write an infinite loop in Java,
    it’s possible to use an infinite stream and never terminate its use.
    By using streams we can build a system that allows optimizations to be hidden easily in the library code
    (lazy evaluation, fusing operations together, making processing concurrent, etc.)

    How to create Streams From collections and arrays:
    Collection.stream()
    Arrays.stream(T array) or Stream.of()
    String.chars()
    Static factories
    IntStream.range()
    new Random().ints()
    Files.walk()
*/


public class StreamsIntroMain {

    public static void main(String[] args) {
        Person[] beatles = {
            new Person("John", 40),
            new Person("Paul", 72),
            new Person("George", 58),
            new Person("Ringo", 74)
        };
        
//        //The Old way to iterate over an array
        for (int i = 0; i < beatles.length; i++) {
            Person beatle = beatles[i];
            System.out.println(beatle);
        }
        
        //Using a Stream - first way
        Stream<Person> stream = Stream.of(beatles);
        
        //Using a Stream - second way
        //Stream<Person> stream = Arrays.stream(beatles);
        
        //Iterate over the stream
        stream.forEach((p) -> System.out.println(p));
    }
}
