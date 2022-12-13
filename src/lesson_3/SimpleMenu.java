package lesson_3;

import java.security.SecureRandom;
import java.util.Scanner;

public class SimpleMenu {
    public static void main(String[] args) {
        /**
         * ======GAME MENU======
         * 1.Generate number
         * 0.Exit!
         **/
        boolean isContinuing = true;
        while (isContinuing) {
            System.out.println("======GAME MENU======");
            System.out.println("Generate number");
            System.out.println("Exit!");
            System.out.println("pls input: ");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            if (num == 0) isContinuing = false;
            else if (num == 1) {
                int ran = new SecureRandom().nextInt(10);
                System.out.printf("random %d\n", ran);
            } else System.out.println("input again");
        }
    }
}
