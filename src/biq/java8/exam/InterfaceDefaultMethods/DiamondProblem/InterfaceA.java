package biq.java8.exam.InterfaceDefaultMethods.DiamondProblem;

public interface InterfaceA {
    default int calc(int x1, int x2) {
        return x1 + x2;
    }
}
