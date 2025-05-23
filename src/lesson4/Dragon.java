package lesson4;

public class Dragon implements Flyable, Eatable{

    @Override
    public void eat() {
       System.out.println("吃牛");
    }

    @Override
    public void fly() {
        System.out.println("飛起來且颳風");
    }

    @Override
    public void circle() {
        System.out.println("盤旋造成龍捲風");
    }
    
}
