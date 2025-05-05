package lesson2;

import basic2.Tes3;
import lesson2.area.*;

public class Demo {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.speak();

        Dog d1 = new Dog();
        d1.speak();
        d1.bark();


        /*
         * 課堂練習
         * 新增Cat 類別 繼承Animal
         * 新增一個method:mia()
         * 印出 "貓在喵喵叫"
         */

        Cat c1 = new Cat();
        c1.speak();
        c1.mia();

        /*
         * 呼叫需要打出絕對位置來呼叫
         */
        // lesson2.area.Test1 test1 = new lesson2.area.Test1();
        // lesson2.area.Test2 test2 = new lesson2.area.Test2();

        /*
         * import後 可直接呼叫類別名稱
         */
        // Test1 test1 = new Test1();
        Test2 test2 = new Test2();


        /*
        * 在不同資料夾下同名稱的類別 需打出絕對位置來呼叫
        */
        lesson1.area.Test1 test11 = new lesson1.area.Test1();
        lesson2.area.Test1 test21 = new lesson2.area.Test1();

        basic2.Tes3 tt3 = new basic2.Tes3();
    }
}
