// Day 09 exercise — see src/main/java/day09/README.md
package day09;

/**
 * A {@link Vehicle} that is a bike. Override {@link #describe()} so that calling
 * it returns exactly {@code "I am a bike"}.
 */
public class Bike extends Vehicle {

    /**
     * @return exactly {@code "I am a bike"}
     */
    @Override
    public String describe() {
        return "I am a bike";
    }

}
 class Car extends Vehicle {

    @Override
    public String describe() {
        return "I am a Car";
    }
}

 class Auto extends Vehicle {

    @Override
    public String describe() {
        return "I am an Auto";
    }
}

public class Main {
    public static void main(String[] args) {

        Vehicle bike = new Bike();
        Vehicle car = new Car();
        Vehicle auto = new Auto();

        System.out.println(bike.describe());
        System.out.println(car.describe());
        System.out.println(auto.describe());
    }
}
