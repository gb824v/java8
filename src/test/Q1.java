package test;

class Q1
{
	public static void main(String arg[])
	{
		Runnable r = () -> System.out.println("I am Lambda");
		new Thread (r).start();

	}
}
