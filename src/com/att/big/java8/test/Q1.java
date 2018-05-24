package com.att.big.java8.test;

class Q1
{
	public static void main(String arg[])
	{
		Runnable r = () -> System.out.println("I am lambda");
		new Thread (r).start();

	}
}
