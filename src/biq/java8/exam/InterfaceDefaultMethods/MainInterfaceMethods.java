package biq.java8.exam.InterfaceDefaultMethods;

public class MainInterfaceMethods {

    public static void main(String[] args) {

        Circle myCircle = new HulaHoopImp();
        myCircle.setRadius(1_000_000);

        System.out.println("Area = " + myCircle.area());
        System.out.println("Circumference = " + Circle.circumference(myCircle));
    }
}
