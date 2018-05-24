package biq.java8.exam.MethodReferences;
import biq.java8.exam.Lambda.Predicate.model.Person;

public class SuperSpecialPersonComparison {

    public int compareByAge(Person p1, Person p2) {
        Integer age1 = p1.getAge();
        return age1.compareTo(p2.getAge());
    }

}
