package lesson3.animals;

public class Cat extends Animal{
    public void mia() {
        System.out.println("貓在喵喵叫");
    }

    /*
    * 覆寫Override
    */
    @Override
    public void speak() {
        System.out.println("動物發出聲音:貓在叫");
    }
}
