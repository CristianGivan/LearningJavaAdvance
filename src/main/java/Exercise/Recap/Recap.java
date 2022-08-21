package Exercise.Recap;
//Scrie o functie care numara cate numere divizibile cu n se afla in intervalul x,y si returneaza valoarea
//Scrie o functie care numara cate cuvinte palindrome se afla intr-o lista

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Recap {
    public static void main(String[] args) {
        int numbersCounted = countDivisionsBy(2, 2, 8);
        System.out.println(numbersCounted);
        System.out.println(isPalindrome("ana"));
        List<String> words= Arrays.asList("Ana","ana","bfb","aiurea");
        System.out.println(countPalindromes(words));

    }
    // int numberToDivide
    // int minInterval, maxInterval
    //int

    public static int countDivisionsBy(int divideBy, int minInterval, int maxInterval) {
        int numbersCount = 0;
        for (int i = minInterval; i <= maxInterval; i++) {
            if (i % divideBy == 0) {
                numbersCount++;
                System.out.println(i);
            }
        }
        return numbersCount;

    }

    public static int countPalindromes(List<String> words) {
        int wordsCounted = 0;

        for (String word : words) {
            if (isPalindrome(word)){
                wordsCounted++;
            }
        }

        return wordsCounted;
    }

    public static boolean isPalindrome(String word) {
        String backWord = "";
        
       

        for (int i = word.length() - 1; i >= 0; i--) {
            backWord += word.charAt(i);
        }
        if (word.equalsIgnoreCase(backWord)){
            return true;
        }
        return false;
    }

}
