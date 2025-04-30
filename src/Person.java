public class Person {

    public String name;
    public int age;
    public boolean isMale;

    public Person(String inputName, int inputAge, boolean inputIsMale) {
        this.name = inputName;
        this.age = inputAge;
        this.isMale = inputIsMale;
    }

    public void showName() {
        System.out.println((isMale? "His ": "Her " ) + "name is " + this.name);
    }

    public void showAge() {
        System.out.println("And"+ (isMale? " he is ": " she is ") + this.age + " years old.");
    }
}