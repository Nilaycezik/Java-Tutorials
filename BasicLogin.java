package examples;

import java.util.Scanner;

public class BasicLogin {
    public static void checkLogin(String username, String password) {
        if ((username.equals("example@example.com")) && (password.equals("1234"))) {
            System.out.println("Successful......");
        } else {
            System.out.println("Please try again......");
        }
    }

    public static void main(String[] args) {

        String username, password;

        Scanner scanner = new Scanner(System.in);
        System.out.println("User name:\t");
        username = scanner.next();
        System.out.println("Password:\t");
        password = scanner.next();
        System.out.println("Your login information is being checked");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        checkLogin(username, password);
    }
}
