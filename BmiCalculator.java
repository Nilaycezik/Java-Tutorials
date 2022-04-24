package examples;

import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your weight:\t");
        int weight = scanner.nextInt();

        System.out.println("Please enter your height (Exp: 1,72):\t");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);
        System.out.println("BMI:\t" + bmi);

        if (bmi < 18.5) {
            System.out.println("You're weak");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("You are at your ideal weight");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("You are overweight");
        } else {
            System.out.println("you are obese");
        }
    }
}
