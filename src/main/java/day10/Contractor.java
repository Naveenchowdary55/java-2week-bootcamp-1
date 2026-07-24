// Day 10 exercise — see src/main/java/day10/README.md
package day10;

/**
 * A contractor who is paid by the hour: pay = hoursWorked × hourlyRate.
 *
 * <p>Example:
 * <pre>
 *   Payable p = new Contractor(10.0, 50.0);
 *   p.calculatePay();   // 500.0
 * </pre>
 */
public class Contractor implements Payable {
    
    private double hoursWorked;
    private double hourlyRate;


    /**
     * Creates a contractor.
     *
     * @param hoursWorked hours worked
     * @param hourlyRate  pay per hour
     */
    public Contractor(double hoursWorked, double hourlyRate) {
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
        
    }

    /**
     * @return hoursWorked × hourlyRate
     */
    @Override
    public double calculatePay() {
        return hoursWorked * hourlyRate;
        
        
    }
}
