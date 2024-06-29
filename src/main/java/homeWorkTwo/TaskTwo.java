package homeWorkTwo;

public class TaskTwo {
    public static void main(String[] args) {
        String taskString = "I study Basic Java!";
        printLastCharAndCheckWordJava(taskString);
        taskString = taskString.toUpperCase();
        taskString = taskString.toLowerCase();
        String cutJavaFromTaskString = taskString.substring(taskString.length()-5, taskString.length()-1);
    }

    public static void printLastCharAndCheckWordJava(String taskString){
        System.out.println(taskString.charAt(taskString.length() -1));
        if(taskString.contains("Java")){
            System.out.println("String contains \"Java\"");
        }else{
            System.out.println("String doesn't contain \"Java\"");
        }
    }
}
