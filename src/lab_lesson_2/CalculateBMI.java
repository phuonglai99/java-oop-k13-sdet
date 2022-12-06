package lab_lesson_2;

import java.util.Scanner;

public class CalculateBMI {
    public static void main(String[] args) {
        float weight, height;
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your weight(kg): ");
        weight = sc.nextFloat();
        System.out.println("please enter your height(m): ");
        height = sc.nextFloat();
        sc.close();
        float BMI = weight / height / height;
        if (BMI < 18.5) {
            //calculate amount of weight need to increase which compared to current weight
            float increaseWeight = (float) (24.9 * height * height) - weight;
            System.out.printf("Underweight \nTry to increase your weight by %.1f kg to reach normal weight", increaseWeight);
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("Normal weight \nKeep your weight");
        } else if (BMI >= 25 && BMI <= 29.9) {
            //calculate amount of weight need to decrease which compared to current weight
            float decreaseWeight = weight - (float) (24.9 * height * height);
            System.out.printf("Overweight \nTry to decrease your weight by %.1f kg to reach normal weight", decreaseWeight);
        } else {
            //calculate amount of weight need to decrease which compared to current weight
            float decreaseWeight = weight - (float) (24.9 * height * height);
            System.out.printf("Obesity \nTry to decrease your weight by %.1f kg to reach normal weight", decreaseWeight);
        }
    }

}
