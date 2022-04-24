package examples;

import java.util.Scanner;

public class GpaCalculator {
    public static double calculator(double note1, double note2, double note3) {

    /*When calculating the GPA, the impact of the first notes is 30%,
    the impact of the second notes is 30%,
    and the impact of the third notes is 40%.*/

        double total_notes;
        total_notes = (note1 * 0.3) + (note2 * 0.3) + (note3 * 0.4);
        System.out.println("GPA " + total_notes);
        return total_notes;
    }

    public static void main(String[] args) {
        double note1, note2, note3, control, pass;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to our GPA calculation system\n Enter your exam grades to start the calculation:\t");
        System.out.println("First notes:\t");
        note1 = scanner.nextDouble();
        System.out.println("Second notes:\t");
        note2 = scanner.nextDouble();
        System.out.println("Third notes:\t");
        note3 = scanner.nextDouble();
        System.out.println("Please enter your passing note:\t");
        pass = scanner.nextDouble();
        if (pass <= 0) {
            System.out.println("You must enter a valid number.....");
        } else {
            if (note1 <= 0) {
                System.out.println("You must enter a valid number.....");
            } else if (note2 <= 0) {
                System.out.println("You must enter a valid number.....");
            } else if (note3 <= 0) {
                System.out.println("You must enter a valid number.....");
            } else {

                control = calculator(note1, note2, note3);
                if (control >= pass) {
                    System.out.println("Congratulations you passed this lesson.....");
                } else {
                    System.out.println("You need to re-prepare for this lesson (Failed).....");
                }

            }
        }
    }
}
