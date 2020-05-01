package thirdQuestion;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] example = fillArray();

        double result = sumArray(example);

        System.out.println("res: "+result);
    }


    public static int[] fillArray(){

        Random random = new Random();
        int[] randomNumbersList = new int[100];

        for (int i=0; i<randomNumbersList.length; i++){
            randomNumbersList[i] = random.nextInt(100);
         }

        return randomNumbersList;
    }

    public static double sumArray(int[] array) {

        int sum = 0;

        for (int i=0; i<array.length; i++) {
            sum += array[i];
        }

        double result = sum / array.length;

        return result;
    }

}
