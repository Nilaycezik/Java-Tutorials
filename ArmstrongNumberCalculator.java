package examples;

public class ArmstrongNumberCalculator {

    public static void main(String[] args) {

        //Example --> 153 = (1*1*1)+(5*5*5)+(3*3*3)

        int temp, units, tenth, hundreds, sum;

        for (int i = 100; i <= 999; i++) {
            temp = i;

        /*First of all, it is necessary to separate
        the number into its digits.*/
            units = temp % 10;
            temp /= 10;
            tenth = temp % 10;
            temp /= 10;
            hundreds = temp % 10;
            temp /= 10;

            sum = (units * units * units) + (tenth * tenth * tenth) + (hundreds * hundreds * hundreds);

            if (sum == i) {
                System.out.println("Armstrong number:\t" + i);
            }
        }
    }
}
