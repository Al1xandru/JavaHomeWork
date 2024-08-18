package homeWorkSeven;

public class TaskII {

    private static final char[] arr = {'I', ' ', 'l', 'i', 'k', '?', ' ', 'J', 'a', 'v', 'a'};

    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != '?'){
                result.append(arr[i]);
            }else {
                result.append('e');
            }
        }
        System.out.println(result.toString());
    }

}
