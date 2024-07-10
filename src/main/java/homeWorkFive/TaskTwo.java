package homeWorkFive;

import java.util.Scanner;

public class TaskTwo {

    public static void main(String[] args) {
        isLeap(new Scanner(System.in).nextInt());
    }
    public static void isLeap(int year){
        if(year % 100 != 0){
            if(year % 4 == 0){
                System.out.println("этот год isLeap");
            }else{
                System.out.println("этот год isNotLeap");
            }
        }else{
            if(year % 400 == 0){
                System.out.println("этот год isLeap");
            }else{
                System.out.println("этот год isNotLeap");
            }
        }
    }
}
