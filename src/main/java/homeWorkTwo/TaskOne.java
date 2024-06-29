package homeWorkTwo;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String inputWords = scanner.nextLine();
            String[] splitedWords = inputWords.split("\\s+");
            splitedWords = removeComma(splitedWords);
            if (checkingWords(splitedWords)) {
                System.out.println(joinTwoWords(splitedWords[0], splitedWords[1]));
            } else if (splitedWords.length != 2) {
                System.out.println("Try again but enter two words with a space between them");
            } else {
                System.out.println("Try again but enter words made up of an even number of letters!");
            }
        }
    }

    public static String joinTwoWords(String firstWord, String secondWord) {
        String halfOfFirstWord = firstWord.substring(0, firstWord.length() / 2);
        String halfOfSecondWord = secondWord.substring(secondWord.length() / 2, secondWord.length());
        return halfOfFirstWord + halfOfSecondWord;
    }

    public static String[] removeComma(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].replace(",", "");
        }
        return array;
    }

    public static boolean checkingWords(String[] array) {
        if (array.length == 2) {
            if (array[0].length() % 2 == 0 && array[1].length() % 2 == 0) {
                return true;
            }
        }
        return false;
    }
}
