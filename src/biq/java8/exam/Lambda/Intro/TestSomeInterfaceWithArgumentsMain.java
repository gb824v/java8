package biq.java8.exam.Lambda.Intro;

public class TestSomeInterfaceWithArgumentsMain {
    public static void main(String[] args) {
        //Return value
        SomeInterfaceWithArgs obj = (v1, v2) -> v1 + v2;
        //Return value
        obj = (v1, v2) -> {return v1 + v2;};

        int calcResult = obj.doSomething(5, 10);
        System.out.println("Result = " + calcResult);
    }
}
