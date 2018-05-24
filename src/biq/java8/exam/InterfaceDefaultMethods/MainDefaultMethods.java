package biq.java8.exam.InterfaceDefaultMethods;

public class MainDefaultMethods {
    public static void main(String[] args) {

        Circle myCircle = new SimpleCircleImp();
        myCircle.setRadius(10);
        System.out.println("Circle Area is: " + myCircle.area());

    }
}
