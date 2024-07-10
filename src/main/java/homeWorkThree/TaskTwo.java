package homeWorkThree;

import java.util.Scanner;

public class TaskTwo {

    public static void main(String[] args) {
        System.out.println(remakeStringToUppercaseAndReverse(new Scanner(System.in).nextLine()));
    }
    public static String remakeStringToUppercaseAndReverse(String string){
        return remakeStringToReverse(string.toUpperCase());
    }
    public static String remakeStringToReverse(String string){
        String resultString = "";
        for(int i = string.length() - 1; i >= 0; i--){
            resultString += string.charAt(i);
        }
        return resultString;
    }
}
