package lesson1;

public class Car {
    public String name;
    public String color;

    /*
     * 建構子(跟類別同名稱的方法)
     * 初始化物件的屬性
     */
    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void showCarInfo() {
        System.out.println("CarName: " + this.name + ",CarColor: " + this.color);
    }
}
