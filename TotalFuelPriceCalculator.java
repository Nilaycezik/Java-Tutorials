package examples;

import java.util.Scanner;

public class TotalFuelPriceCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What currency do you use?\t");
        String currency = scanner.nextLine();
        System.out.println("How much does your vehicle burn per kilometer? (Exp: 0,32)\t");
        double cent = scanner.nextDouble();
        System.out.println("How many kilometers did you travel with your vehicle?\t");
        int kilometers = scanner.nextInt();
        System.out.println("Total price:\t"+(cent*kilometers)+" "+currency);
    }
}
