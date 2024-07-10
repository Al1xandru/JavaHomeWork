package homeWorkFour;

import java.util.Random;

public class TaskTwo {

    final static int taskNumber = new Random().nextInt(28801);

    public static void main(String[] args) {
        System.out.println(taskNumber + " seconds left");
        int hourLeft = (taskNumber / 60) / 60;
        switch (hourLeft){
            case 1:
                System.out.println("осталось " + hourLeft + " час");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("осталось " + hourLeft + " часа");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                System.out.println("осталось " + hourLeft + " часов");
                break;
            default:
                System.out.println("осталось менее часа");
        }

    }
}
