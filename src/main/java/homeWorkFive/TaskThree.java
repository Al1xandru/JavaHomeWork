package homeWorkFive;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        int [] numbers = new int[3];
        for(int i = 0; i < 3; i++){
            System.out.println("Input number " + (i + 1));
            numbers[i] = new Scanner(System.in).nextInt();
        }
        System.out.println("Max number is: " + findMaxNumber(numbers));
    }
    public static int findMaxNumber(int [] array){
        int maxNumber = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] > maxNumber){
                maxNumber = array[i];
            }
        }
        return maxNumber;
    }
}
