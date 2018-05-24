package com.att.biq.day26.java8.exam.lambda.intro;

/**
 *
 * @author Liron Blecher
 */
//you don't have to add the "@FunctionalInterface" annotation
//Functional Interfaces
//All functional interfaces are recommended to have an informative @FunctionalInterface annotation. This not only clearly communicates the purpose of this interface, but also allows a compiler to generate an error if the annotated interface does not satisfy the conditions.
//Any interface with a SAM(Single Abstract Method) is a functional interface, and its implementation may be treated as lambda expressions.
//Note that Java 8’s default methods are not abstract and do not count: a functional interface may still have multiple default methods. You can observe this by looking at the Function’s documentation.
@FunctionalInterface
//The interface MUST have a single abstract method
//meaning, ONE method definition with no implementation
public interface SomeInterface {
    public void doSomething();
}