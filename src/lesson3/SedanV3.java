package lesson3;

public class SedanV3 extends Car{
    public SedanV3(String name, int maxSpeed) {
        super(name, maxSpeed);
    }

    /*
     * 覆寫條件:
     * 1.子類別方法名稱需跟父類別方法名稱相同
     * 2.子類別方法需跟父類別方法同樣數量的輸入的參數
     * 3.子類別方法型別也都須跟父類別的方法型別相同
     */
    @Override
    public void wiper() {
        String getCarName = super.getName();
        System.out.println(getCarName + "尊榮版本");
        System.out.println(getCarName + "加強版的新功能: 噴水雨刷");
    }

    public void wiper(String plus) {
        String getCarName = super.getName();
        System.out.println(getCarName + "威力版本的新功能: 噴水雨刷");
    }

    @Override
    public void getMaxSpeed() {
        String getCarName = super.getName();
        System.out.println(getCarName + ", 加價會有更大馬力的速度");
    }
}
