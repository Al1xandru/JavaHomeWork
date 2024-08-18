package homeWorkSeven;

public class TaskI {
    public static void main(String[] args) {
        System.out.println(stickAndReverse("123", "456"));
    }
    public static String stickAndReverse(String stringOne, String stringTwo){
        return new StringBuilder(stringOne).append(stringTwo).reverse().toString();
    }
}
