package com.att.biq.day26.java8.my;

public class Main
{
	public static void main(String[] args)
	{
		// Option A
		Greeter g = (String kingName) -> System.out.println("Hello" + kingName);
		g.sayHello("Robert");

		// Option B
		g = (String kingName) ->
		{
			System.out.println("Hello" + kingName);
		};
		g.sayHello("Robert");
	}
}
