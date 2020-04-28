package firstQuestion;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String password = scanInput();

        compare(password);
    }

    public static void compare(String inputPassword){

        final String password = "passW$$";

        if (inputPassword.equals(password)) {

            System.out.println("Login Succesful");
        }

        System.out.println("Incorrect Password. Try again later.");
    }

    public static String scanInput() {

        System.out.println("Please enter your password");
        String password = scanner.nextLine();

        return password;
    }

}
