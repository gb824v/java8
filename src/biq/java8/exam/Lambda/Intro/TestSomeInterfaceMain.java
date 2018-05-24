package biq.java8.exam.Lambda.Intro;

////LambdaExpressions.mp3 min
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

        // this is a Lambda expression
        obj = () -> System.out.println("Doing something!");

        obj.doSomething();
    }
}