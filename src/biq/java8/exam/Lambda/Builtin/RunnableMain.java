package biq.java8.exam.Lambda.Builtin;
//LambdaExpressions.mp3 min 5
public class RunnableMain {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("Running Thread 1")).start();
        new Thread(() -> System.out.println("Running Thread 2")).start();
    }
}
