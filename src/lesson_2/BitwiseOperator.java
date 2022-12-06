package lesson_2;

public class BitwiseOperator {
    public static void main(String[] args) {
        if (getFirstNum() != 8 && getSecondNum() != 0) {
            System.out.println("Calculating...");
        }
    }

    public static int getFirstNum() {
        System.out.println("Calling getting first num!");
        return 1;
    }

    public static int getSecondNum() {
        System.out.println("Calling getting second num!");
        return 2;
    }
}
