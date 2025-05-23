package lesson3;

public class MessagePrinter {
    public void printMessage(String inpuString) {
        System.out.println(inpuString);
    }

    public void printMessage(double inputDouble1, double inputDouble2) {
        String r1 = "d1:" + inputDouble1 + "-d2:" + inputDouble2;
        System.out.println(r1);
    }

    public void printMessage(int inputInt1, int inputInt2, String inpuString) {
        String r1 = "i1:" + inputInt1 + "-i2:" + inputInt2;
        r1 = r1 + "-string:" + inpuString;
        System.out.println(r1);
    }
}
