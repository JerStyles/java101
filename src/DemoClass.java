public class DemoClass {

    public static void main(String[] args) {
        // Car tesla = new Car("001", "blue");
        // tesla.showCarInfo();

        // Person david = new Person("David", 32, true);
        // david.showName();
        // david.showAge();

        // Person cathy = new Person("Cathy", 78, false);
        // cathy.showName();
        // cathy.showAge();
    
        
        // for(int i = 0, amount = 10; i < amount; i++) {
        //     System.out.println("Clothes No. " + (i + 1) + ". " +
        //         "Brand: " + Clothes.brandname + ". " +
        //         "Size: " + Clothes.size + ". " +
        //         "Color: " + Clothes.color + ". " +
        //         "Price: " + Clothes.price );
        // }

        Saving mySaving = new Saving("Jeff", 10000 );
        Saving herSaving = new Saving("Cathy", 12);
        // mySaving.showBalance();

        // System.out.println("Original name is " + mySaving.getAccount());
        // mySaving.setAccout("Jenny");
        // System.out.println("The new name is " + mySaving.getAccount());

        // System.out.println("Original name is " + herSaving.getAccount());
        // // herSaving.setAccout("Jenny");
        // System.out.println("The new name is " + herSaving.getAccount());
        
        herSaving.setBalance("Cathy", true, 3);
        System.out.println("You now have " + herSaving.getBalance() + " in your bank.");
    }
}