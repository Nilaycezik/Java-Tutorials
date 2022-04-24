package examples;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("First number:\t");
        int first_num = scanner.nextInt();
        System.out.println("Second Number:\t");
        int second_num = scanner.nextInt();
        System.out.println("Third Number:\t");
        int third_num = scanner.nextInt();
        if (first_num >= 0 && second_num >= 0 && third_num >= 0 ){
            if (first_num >= second_num && first_num >= third_num) {
                System.out.println("Largest number:\t" + first_num);
            } else if (second_num >= first_num && second_num >= third_num) {
                System.out.println("Largest number:\t" + second_num);
            } else {
                System.out.println("Largest number:\t" + third_num);
            }
        }
        else{
            System.out.println("You must enter a valid number.......");
        }
    }
}
