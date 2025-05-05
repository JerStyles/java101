public class Car {

    private int maxSpeed;

    public Car(int speed) {
        this.setMaxSpeed(speed); 
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void wiper() {
        System.out.println("Added wiper");
    }
}