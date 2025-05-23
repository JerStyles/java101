package lesson4;

public class Bird implements Flyable, Eatable {

    @Override
    public void fly() {
       System.out.println("飛起來");
    }

    @Override
    public void circle() {
        System.out.println("盤旋");
    }
    
    @Override
    public void eat() {
        System.out.println("吃蟲");
    }
    
}
