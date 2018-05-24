package com.att.biq.day26.java8.exam.lambda.intro;
//Lesson 1
public class TestSomeInterfaceMain {
	public static void main(String[] args) {
		// old anonymous way
		SomeInterface obj = new SomeInterface() {
			@Override
			public void doSomething() {
				System.out.println("Old Anonymous Interface Way!");
			}
		};

		// this is another way of writing an anonymous class, like this one:
		obj = () -> {
			System.out.println("Old Anonymous Interface Way!");
		};

		// this is a lambda expression
		 obj = () -> System.out.println("Doing something!");

		obj.doSomething();
	}
}