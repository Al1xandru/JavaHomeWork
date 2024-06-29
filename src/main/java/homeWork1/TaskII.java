package homeWork1;

import java.util.Scanner;

public class TaskII {
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        String numberToString = String.valueOf(number);
        for(int i = 0; i < numberToString.length(); i++){
            if(i < numberToString.length() - 1){
                System.out.print(numberToString.charAt(i) + ", ");
            }else{
                System.out.print(numberToString.charAt(i));
            }
        }
    }
}
