package assignment;

public class CommissionEmployee extends Employee {
    private int grossSales = 0;
    private double commissionRate = 0.0;
    private int baseSalary = 0;
    private int maxBaseSalary = 20000;
    private double maxCommissionRate = 0.3;

    CommissionEmployee(String _name, String _mobile, int _grossSales, double _commissionRate, int _baseSalary) {
        super(_name, _mobile);
        if (!ValidateInput(_grossSales, _commissionRate, _baseSalary)) {
            throw new IllegalArgumentException("Invalid input!");
        }
        setGrossSales(_grossSales);
        setCommissionRate(_commissionRate);
        setBaseSalary(_baseSalary);
    }

    public int getGrossSales() {
        return this.grossSales;
    }

    private void setGrossSales(int _grossSales) {
        this.grossSales = _grossSales;
    }

    public double getCommissionRate() {
        return this.commissionRate;
    }

    private void setCommissionRate(double _commissionRate) {
        this.commissionRate = _commissionRate;
    }

    public void raiseCommissionRate(double _newCommissionRate) {
        if (_newCommissionRate > maxCommissionRate) {
            throw new IllegalArgumentException("Commission rate is too high!");
        }
        setCommissionRate(_newCommissionRate);
    }

    public int getBaseSalary() {
        return this.baseSalary;
    }

    private void setBaseSalary(int _baseSalry) {
        this.baseSalary = _baseSalry;
    }


    protected boolean ValidateInput(int _grossSales, double _commissionRate, int _baseSalary) {
        if (_grossSales <= 0 || _commissionRate <= 0 || (_baseSalary <= 0 && _baseSalary > maxBaseSalary)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return String.format("Name: %s. Mobile: %s", this.getName(), this.getMobile());
    }

    @Override
    public void getTax() {
        double tax = (this.getGrossSales() * this.getCommissionRate() + this.getBaseSalary()) * 0.05;
        System.out.println(String.format("Tax: %f", tax));
    }

    @Override 
    public void earnings() {
        double base = this.getGrossSales() * this.getCommissionRate() + this.getBaseSalary();
        System.out.println(String.format("Earning before tax: %f", base));
    }

    @Override
    public void getPaymentAmount() {
        double base = this.getGrossSales() * this.getCommissionRate() + this.getBaseSalary();
        System.out.println(String.format("Payment receivable: %f", base - (base * 0.05)));
    }
}