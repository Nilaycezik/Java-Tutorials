package examples;

import java.util.Scanner;

public class DiscountCalculationByAge {
    public static double calculator(double price, int age) {

        /*While calculating, the discount rate for those under the age of 25 is determined as 50%.
        Similarly, it was determined as 30% for those aged 25 to 45, 20% for those aged 45 to 65,
        and 50% for those over 65.*/

        double total_price = 0;
        if (age >= 0 && age < 25) {
            System.out.println("Discount rate:\t 50%");
            total_price = price - (price * 0.50);
            System.out.println(total_price);
        } else if (age >= 25 && age < 45) {
            System.out.println("Discount rate:\t 30%");
            total_price = price - (price * 0.30);
            System.out.println(total_price);
        } else if (age >= 45 && age < 65) {
            System.out.println("Discount rate:\t 20%");
            total_price = price - (price * 0.20);
            System.out.println(total_price);
        } else if (age >= 65) {
            System.out.println("Discount rate:\t 50%");
            total_price = price - (price * 0.50);
            System.out.println(total_price);
        }
        return total_price;
    }


    public static void main(String[] args) {
        int age;
        double price;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter age:\t");
        age = scanner.nextInt();
        System.out.println("Please enter price:\t");
        price = scanner.nextInt();
        System.out.println("The discount is calculated. Please wait....");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        calculator(price, age);
    }
}
