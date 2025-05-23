package lesson4;

public abstract class Notification {
    private String recipient;

    public Notification(String recipient) {
        this.recipient = recipient;
    }

    // 抽象方法, 子類別必須實作
    public abstract void send();

    public void log(){
        System.out.println("已送出通知給:" + this.recipient);
    }

    public String getRecipient() {
        return this.recipient;
    }
}
