package assignment;

public class Employee extends Earning implements IPayable, IInvoice {
    private String name;
    private String mobile;

    Employee(String _name, String _mobile) {
        if (!ValidateInput(_name, _mobile)){
            throw new IllegalArgumentException("Invalid name and mobile number!");
        }
        setName(_name);
        setMobile(_mobile);
    }

    public String getName() {
        return this.name;
    }

    private void setName(String _name) {
        this.name = _name;
    }

    public String getMobile() {
        return this.mobile;
    }

    private void setMobile(String _mobile){

        this.mobile = _mobile;
    }

    protected boolean ValidateInput(String _name, String _mobile) {
        if (_name.isBlank()) {
            return false;
        }
        
        if (_mobile == null || _mobile.length() != 10) {
            return false;
        }
        return true;
    }


    @Override
    public String toString() {
        return null;
    }

    @Override
    public void getTax() {

    }

    @Override
    public void earnings() {

    }

    @Override
    public void getPaymentAmount() {

    }

}