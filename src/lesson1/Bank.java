package lesson1;
public class Bank {
    /*
     * private(私有) 只能在此類別作使用
     */
    private String account;
    private int balance1 = 0;

    public Bank(String registerAccount, int inputBalance) {
        this.account = registerAccount;
        this.balance1 = inputBalance;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getBalance1(String account) {
        if(account != this.account) {
            System.out.println("您的帳號輸入錯誤,無法顯示餘額");
            return 0;
        } else {
            return this.balance1;
        }
        
    }

    // 想像情境: 存錢(deposit)/提款(withdraw)
    public void setBalance1(String account, String action, int balance1) {
        if(account != this.account) {
            System.out.println("您的帳號輸入錯誤,無法繼續執行此交易");
        } else {
            // 存錢
            if(action == "deposit") {
                if(balance1 > 0) {
                    this.balance1 =  this.balance1 + balance1;
                } else {
                    System.out.println("存進來的金額需大於0");
                }
            }

            // 提款
            if(action == "withdraw") {
                if(this.balance1 >= balance1) {
                    this.balance1 =  this.balance1 - balance1;
                } else {
                    System.out.println("您的餘額不足");
                }
            }
        }
    }

    public void showBalance() {
        System.out.println(this.account + " balance: " + this.balance1);
    }

}
