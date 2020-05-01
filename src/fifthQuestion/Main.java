package fifthQuestion;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] randomNumbers = fillArray();

        List<List<Integer>> seperatedLists = classifiedNumbers(randomNumbers);

        System.out.println(seperatedLists);
    }

    public static int[] fillArray(){

        Random random = new Random();
        int[] randomNumbersList = new int[100];

        for (int i=0; i<randomNumbersList.length; i++){

            randomNumbersList[i] = random.nextInt();
        }

        return randomNumbersList;
    }

    public static List<List<Integer>> classifiedNumbers(int[] array){

        List<Integer> oddNumbers = new ArrayList<>();
        List<Integer> evenNumbers = new ArrayList<>();
        List<List<Integer>> classifiedNumbers = new ArrayList<>();

        for (int i=0; i<array.length; i++){

            if (array[i] % 2 != 0) {
                oddNumbers.add(array[i]);
                System.out.println("Tek: "+array[i]);
            } else {
                evenNumbers.add(array[i]);
                System.out.println("Çift: "+array[i]);
            }

        }
        classifiedNumbers.add(oddNumbers);
        classifiedNumbers.add(evenNumbers);

        return classifiedNumbers;
    }

}
