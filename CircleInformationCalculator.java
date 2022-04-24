package examples;

import java.util.Scanner;

public class CircleInformationCalculator {
    //PI number is accepted as 3.14
    //r = radius
    public static double perimeter(int r) {
        double perimeter_circle, pi = 3.14;
        perimeter_circle = (2 * pi * r);
        System.out.println("perimeter_circle------>>>" + perimeter_circle);
        return perimeter_circle;
    }

    public static double area(int r) {
        double area_circle, pi = 3.14;
        area_circle = (pi * r * r);
        System.out.println("area_circle-------->>>" + area_circle);
        return area_circle;
    }

    public static void main(String[] args) {
        int choose, r;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter radius:\t");
        r = scanner.nextInt();

        System.out.println("1- Area Circle\n2-Perimeter Circle");
        choose = scanner.nextInt();

        switch (choose) {
            case 1:

                if (r > 0) {
                    area(r);
                } else {
                    System.out.println("You must enter a valid number");
                }
                break;
            case 2:
                if (r > 0) {
                    perimeter(r);
                } else {
                    System.out.println("You must enter a valid number");
                }
                break;
            default:
                System.out.println("You must enter a valid number");
                break;
        }
    }
}
