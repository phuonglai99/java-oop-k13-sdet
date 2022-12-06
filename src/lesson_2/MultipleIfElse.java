package lesson_2;

import java.util.Scanner;

public class MultipleIfElse {
    public static void main(String[] args) {
        //<18 | 18-55 | >55
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int clientAge = sc.nextInt();

        if (clientAge < 18) {
            System.out.println("Khong ban!");
            if (clientAge <= 12) {
                System.out.println("Caliing 911...");
            }
        } else if (18 <= clientAge && clientAge <= 55) {
            System.out.println("Unlimited!");
        } else {
            System.out.println("2 chai!!");
        }
    }
}
