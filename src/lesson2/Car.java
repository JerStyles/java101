package lesson2;
public class Car {
    /*
     * 類別的屬性為全域變數(globe) 可以讓這個類別下的所有方法使用
     */
    public String name;
    public String color;
    /*
     * 建構子(跟類別同名稱的方法)
     * 初始化物件的屬性
     */
    // public Car(String name, String color) {
    //     // 在此method宣告的變數為區域變數
    //     // 沒寫this的變數為區域變數 只能在此method內使用
    //     this.name  = name;
    //     this.color = color;
    // }


    public Car(String inputName, String inputColor) {
        this.name  = inputName;
        this.color = inputColor;
    }

    public void showCarInfo() {
        System.out.println("CarName: " + this.name + ",CarColor: " + this.color);
    }

    public void change() {
        name  = "aa";
        color = "red";
    }
}
