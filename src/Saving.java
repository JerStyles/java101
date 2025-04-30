public class Saving {
    private String account;
    private int balance = 0;

    public Saving(String account, int balance) {
        this.account = account;
        this.balance = balance;
    }

    public void showBalance() {
        System.out.println("Account name: " + this.account + "\n" +
                "Balance: " + this.balance);
    }

    public String getAccount() {
        return this.account;
    }

    public int getBalance () {
        return this.balance;
    }

    public void setAccout(String account) {
        this.account = account;
    }

    public void setBalance(String account, boolean isDeposit, int amount) {

        if (account != this.account) {
            System.out.println("Wrong name! You can't access the account!");
            return;
        }

        if (!isDeposit && (this.balance <= 0 || amount <= 0)) {
            System.out.println("Withdrawal failed! You don't have enough money! or amount not correct!");
            return;
        }

        if (isDeposit && amount < 0) {
            System.out.println("Deposit failed! Invalid deposit amount!");
            return;
        }

        
        this.balance += ((isDeposit)? amount: amount* (-1));
        
        // if (isDeposit) {

        //     this.balance += amount;
        //     return;
        // }
        // else if (!isDeposit) {
        //     this.balance -= amount;
        //     return;
        // }   
    }
}