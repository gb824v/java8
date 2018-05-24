package test;

import java.util.Arrays;

class Person
{
	String firstName;
	String lastName;
	int age;

	public Person(String firstName, String lastName, int age)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public static void main(String arg[])
	{

		Person[] persons = new Person[]
				{
				new Person("Aant", "Levi", 40), new Person("Shiri", "Levi", 50),
				new Person("Michal", "Cohen", 60), new Person("Yael", "Cohen", 70)
				};

		Arrays.stream(persons).filter(p -> "Cohen".equals(p.lastName)).map(p -> p.firstName)
				.forEach(n -> System.out.println(n));

	}
}
