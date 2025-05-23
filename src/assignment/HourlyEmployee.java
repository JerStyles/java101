package assignment;

public class HourlyEmployee extends Employee {
    private double wage = 0;
    private int hours = 0;
    private int maxHours = 160;

    HourlyEmployee(String _name, String _mobile, double _wage, int _hours) {
        super(_name, _mobile);
        if (!ValidateInput(_wage, _hours)) {
            throw new IllegalArgumentException(
                    "Invalid input! Wage must be non-negative number and hours need to be less than 160 hours.");
        }
        this.wage = _wage;
        this.hours = _hours;
    }

    protected boolean ValidateInput(double _wage, int _hours) {
        if (_wage <= 0) {
            return false;
        }

        if (_hours <= 0 || _hours > maxHours) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Mobile: %s", this.getName(), this.getMobile());
    }

    @Override
    public void getTax() {
        System.out.println(this.wage * this.hours * 0.05);
    }

    @Override
    public void earnings() {
        System.out.println(String.format("Paycheck before tax: %f",(wage * (double) hours)));
    }

    @Override
    public void getPaymentAmount() {
        System.out.println(String.format("Payment receivable after tax: %f", (wage * hours) - (wage * hours * 0.05)));
    }
}