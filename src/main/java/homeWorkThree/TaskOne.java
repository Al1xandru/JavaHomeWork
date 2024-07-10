package homeWorkThree;

import java.util.Random;

public class TaskOne {

    public static void main(String[] args) {
        int numberOne = new Random().nextInt(100);
        int numberTwo = new Random().nextInt(100) + 1;
        System.out.println(addingTwoNumbers(numberOne, numberTwo));
        System.out.println(subtractionOfTwoNumbers(numberOne, numberTwo));
        System.out.println(multiplicationsOfTwoNumbers(numberOne, numberTwo));
        System.out.println(divisionsOfTwoNumbers(numberOne, numberTwo));
    }
    public static int addingTwoNumbers(int numberOne, int numberTwo){
        return numberOne + numberTwo;
    }
    public static int subtractionOfTwoNumbers(int numberOne, int numberTwo){
        return numberOne - numberTwo;
    }
    public static int multiplicationsOfTwoNumbers(int numberOne, int numberTwo){
        return numberOne * numberTwo;
    }
    public static int divisionsOfTwoNumbers(int numberOne, int numberTwo){
        return numberOne / numberTwo;
    }
}
