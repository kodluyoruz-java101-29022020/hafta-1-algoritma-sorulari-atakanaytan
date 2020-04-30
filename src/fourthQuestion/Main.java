package fourthQuestion;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please enter the row number ");
        int rowLenght = scanner.nextInt();

        String result = startTriangle(rowLenght);

        System.out.println(result);
    }

    public static String startTriangle(int number){
        StringBuilder stringBuilder = new StringBuilder();

        for (int i=0; i<number; i++){
            for (int j=0; j<=i; j++){
                stringBuilder.append("*");
            }
            stringBuilder.append(System.lineSeparator());
        }
        return stringBuilder.toString();
    }
}
