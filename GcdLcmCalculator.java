package examples;

import java.util.Scanner;

public class GcdLcmCalculator {

    public static int gcd(int number1, int number2) {
        int gcd = 1;
        int min = (number1 < number2) ? number1 : number2;
        for (int i = min; i > 0; i--) {
            if (number1 % i == 0 && number2 % i == 0) {
                gcd = i;
                break;
            }
        }
        System.out.println("gcd values:\t" + gcd);
        return gcd;
    }

    public static int lcm(int number1, int number2) {
        int gcd = 1, lcm;
        int min = (number1 < number2) ? number1 : number2;
        for (int i = min; i > 0; i--) {
            if (number1 % i == 0 && number2 % i == 0) {
                gcd = i;
                break;
            }
        }
        lcm = (number1 * number2) / gcd;
        System.out.println("lcm values:\t" + lcm);
        return gcd;
    }

    public static void main(String[] args) {
        int number1, number2, choose;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number:\t");
        number1 = scanner.nextInt();
        System.out.println("Please enter the second number:\t");
        number2 = scanner.nextInt();
        System.out.println("1-GCD\n2-LCM\n");
        choose = scanner.nextInt();

        switch (choose) {
            case 1:
                System.out.println("GCD is calculated.Please wait........");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                gcd(number1, number2);
                break;

            case 2:
                System.out.println("LCM is calculated.Please wait........");

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                lcm(number1, number2);
                break;

            default:
                System.out.println("You must enter a valid number........");
                break;
        }
    }
}