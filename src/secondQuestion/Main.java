package secondQuestion;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please enter the first and the second number: ");

        int firstNumber, secondNumber;

        firstNumber = scanner.nextInt();
        secondNumber = scanner.nextInt();

        System.out.println("Plese select which operation to perform. 1 for Addition " +
                "2 for Substraction, 3 for Multiplication, 4 for Division: ");

        int operation = scanner.nextInt();

        switch (operation) {
            case 1:
                System.out.println("result is: " + addition(firstNumber, secondNumber));
                break;
            case 2:
                System.out.println("result is: "+ substraction(firstNumber, secondNumber));
                break;
            case 3:
                System.out.println("result is: " + multiplication(firstNumber, secondNumber) );
                break;
            case 4:
                System.out.println("result is: " + division(firstNumber, secondNumber));
                break;
            default:
                System.out.println("Invalid operation");
        }
    }

    public static int addition(int firstNum, int secondNum){
        return firstNum + secondNum;
    }

    public static int substraction(int firstNum, int secondNum){
        return firstNum - secondNum;
    }

    public static int multiplication(int firstNum, int secondNum){
        return firstNum * secondNum;
    }

    public static double division(int firstNum, int secondNum){
        return (double) firstNum / secondNum;
    }

}

