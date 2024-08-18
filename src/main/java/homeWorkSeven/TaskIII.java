package homeWorkSeven;

public class TaskIII {
    public static void main(String[] args) {
        System.out.println(reverseWordsBySpaces("Изменить порядок слов в данной строке на обратный"));
    }
    public static String reverseWordsBySpaces(String string){
        int savedIndex = string.length();
        StringBuilder result = new StringBuilder();
        for(int i = string.length() -1; i >= 0; i--){
            if(string.charAt(i) == ' '){
                result.append(string.substring(i + 1, savedIndex));
                result.append(" ");
                savedIndex = i;
            }
        }
        result.append(string.substring(0, savedIndex));
        return result.toString();
    }
}
