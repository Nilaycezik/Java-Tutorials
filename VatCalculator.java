package examples;

import java.util.Scanner;

public class VatCalculator {
    public static double calculator(double price) {
        //VAT is accepted as 18%
        double vat = 0.18, vat_price;
        vat_price = price + (price * vat);
        System.out.println("Your VAT amount:\t" + (price * vat));
        System.out.println("Your amount together with VAT amount:\t" + vat_price);
        return vat_price;
    }

    public static void main(String[] arg) {
        double price;
        int choose;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the price of the product for which you want VAT calculated:");
        price = scanner.nextDouble();

        if (price <= 0) {
            System.out.println("You must enter a valid number......");

            System.out.println("Do you want to recalculate?\n 1-)Yes\n 2-) No");
            choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    System.out.println("Enter the price of the product for which you want VAT calculated:");
                    price = scanner.nextDouble();
                    if (price <= 0) {
                        System.out.println("Your right to enter has been expired");
                    } else {
                        calculator(price);
                    }
                    break;
                case 2:
                    System.out.println("Thanks for your time.");
                    break;
                default:
                    System.out.println("Could not continue because no valid entry was made.");
                    break;
            }
        } else {
            calculator(price);
        }
    }
}
