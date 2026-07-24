// Day 10 exercise — see src/main/java/day10/README.md
package day10;

/**
 * Anything that can be paid. This is an <b>interface</b> — a pure contract. It
 * says "whoever implements me must be able to calculate their pay" without
 * caring how. A contractor and a salaried employee compute pay completely
 * differently, yet both are {@code Payable}.
 *
 * <p>This interface is PROVIDED. You write {@link Contractor} and
 * {@link SalariedEmployee}, which {@code implements Payable}.
 */
public interface Payable {

    /**
     * @return how much this person should be paid
     */
    double calculatePay();
    public class Contractor implements Payable {

    private double hoursWorked;
    private double hourlyRate;

    public Contractor(double hoursWorked, double hourlyRate) {
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculatePay() {
        return hoursWorked * hourlyRate;
    }
}
}
