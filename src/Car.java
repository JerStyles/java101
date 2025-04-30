public class Car {

    // 屬性
    public String color;
    public String number;
    public int year = 0;

    // 建構子
    public Car(String inputNumber, String inputColor) {
        this.color = inputColor;
        this.number = inputNumber;
    }

    // 方法
    public void showCarInfo() {
        System.out.println("Car number is " + this.number + ". Car color is " + this.color);
    }
}