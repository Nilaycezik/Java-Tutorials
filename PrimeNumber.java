package examples;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        int number;
        boolean prime = true;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("You must enter a valid number......\t");
            number = scanner.nextInt();
        } while (number < 2);

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }
        if (prime == true) {
            System.out.println("The entered number is prime.");

        } else {
            System.out.println("The entered number is not prime.");
        }
    }
}