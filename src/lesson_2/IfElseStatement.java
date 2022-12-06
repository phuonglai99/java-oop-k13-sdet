package lesson_2;

import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter arrival time: ");
        final int EXPECTED_TIME = 7;
        int arrivalTime = sc.nextInt();

        //comparison operator: ==;!+;<=;>=;<;>
        //boolean isHeOnTime = arrivalTime == EXPECTED_TIME;

        //tenary operator
        boolean isHeOnTime = (arrivalTime==EXPECTED_TIME)?true:false;

        System.out.println("1. Dat xe ra");
        System.out.println("2. Chay toi quan");

        if (isHeOnTime) {
            System.out.println("\t---> Let's talk");
        } else {
            System.out.println("\t---> Write a letter!");
        }

        System.out.println("1. Dat xe ra");
        System.out.println("2. Chay ve nha");
    }
}
