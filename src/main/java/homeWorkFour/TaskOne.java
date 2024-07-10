package homeWorkFour;

import java.util.Random;

public class TaskOne {

    static final int taskNumber = 10;

    public static void main(String[] args) {
        Random random = new Random();
        double m = random.nextDouble(20);
        double n = random.nextDouble(20);
        System.out.println("Число " + comparingNumbersWithTaskNumber(m, n) + " ближе к 10.");
    }
    public static double comparingNumbersWithTaskNumber(double firstNumber, double secondNumber){
        return (Math.abs(taskNumber - firstNumber) < Math.abs(taskNumber - secondNumber)) ? firstNumber : secondNumber;
    }
}
