package examples;

import java.util.Scanner;

public class BasicSort {
    public static void sorting(int number1, int number2, int number3) {

        if (number1 > number2 && number1 > number3) {
            if (number2 > number3) {
                System.out.println("Sorting:\t" + number1 + ">" + number2 + ">" + number3);
            } else if (number3 > number2) {
                System.out.println("Sorting:\t" + number1 + ">" + number3 + ">" + number2);
            }
        } else if (number2 > number1 && number2 > number3) {
            if (number1 > number3) {
                System.out.println("Sorting:\t" + number2 + ">" + number1 + ">" + number3);
            } else if (number3 > number2) {
                System.out.println("Sorting:\t" + number2 + ">" + number3 + ">" + number1);
            }
        } else if (number3 > number1 && number3 > number2) {
            if (number1 > number2) {
                System.out.println("Sorting:\t" + number3 + ">" + number1 + ">" + number2);
            } else if (number2 > number1) {
                System.out.println("Sorting:\t" + number3 + ">" + number2 + ">" + number1);
            }
        } else if (number1 == number2 && number1 > number3) {
            System.out.println("Sorting:\t" + number1 + "=" + number2 + ">" + number3);
        } else if (number1 == number2 && number3 > number1) {
            System.out.println("Sorting:\t" + number3 + ">" + number1 + "=" + number2);
        } else if (number2 == number3 && number2 > number1) {
            System.out.println("Sorting:\t" + number2 + "=" + number3 + ">" + number1);
        } else if (number1 == number3 && number1 > number2) {
            System.out.println("Sorting:\t" + number1 + ">" + number2 + "=" + number3);
        } else if (number1 == number2 && number2 == number3) {
            System.out.println("Sorting:\t" + number1 + "=" + number2 + "=" + number3);
        }
    }

    public static void main(String[] args) {
        int number1, number2, number3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number:\t");
        number1 = scanner.nextInt();
        System.out.println("Please enter the second number:\t");
        number2 = scanner.nextInt();
        System.out.println("Please enter the third number:\t");
        number3 = scanner.nextInt();
        System.out.println("The numbers are sorted. Please wait....");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        sorting(number1, number2, number3);
    }
}
