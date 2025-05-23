package assignment;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    BasePlusCommissionEmployee(String _name, String _mobile, int _grossSales, double _commissionRate, int _baseSalary) {
        super(_name, _mobile, _grossSales, _commissionRate * 1.3, _baseSalary);
    }

    @Override
    public String toString() {
        return String.format("Name: %s. Mobile: %s", this.getName(), this.getMobile());
    }
}
