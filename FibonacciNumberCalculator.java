package examples;

import java.util.Scanner;

public class FibonacciNumberCalculator {

    public static void main(String[] args) {
        //Fibonacci series 0,1,1,2,3,5,8.....

        int number1 = 0, number2 = 1, choose, sum;

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many elements do you want to see in the Fibonacci sequence?:\t");
        choose = scanner.nextInt();

        for (int i = 1; i <= choose; i++) {
            System.out.print(number1 + ",\t");

            sum = number1 + number2;
            number1 = number2;
            number2 = sum;
        }
    }
}
