package Exercise.SpellChecker;

import org.mockito.internal.matchers.Null;

import java.util.*;

public class SpellChecker {
    public static void main(String[] args) {
        Set<String> dictionary = createDictionary();
        List<String[]> text = createText();
        Set<String> wordsNotInDictionary=new HashSet<>();
        for (String[] words : text) {
            for (String word : words) {
                if (!dictionary.contains(word)){
                    wordsNotInDictionary.add(word);
                }
            }
        }
        System.out.println("The dictionary is: ");
        System.out.println(dictionary);
        System.out.println("\nThe text is: ");
        displayText(text);
        System.out.println("\nThe words that are not in dictionary are: ");
        System.out.println(wordsNotInDictionary);
    }

    public static void displayText(List<String[]> text){
        for (String[] words : text) {
            System.out.print("[ ");
            for (String word : words) {
                System.out.print(word+" ");
            }
            System.out.println("]");
        }
    }
    public static List<String[]> createText() {
        int numberOfRows;
        String words;
        String[] textOnALine = null;
        List<String[]> text = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the number of rows of the text");
        numberOfRows = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfRows; i++) {
            System.out.println("Insert the text in row " + (i + 1) + " from " + numberOfRows);
            words = scanner.nextLine();
            textOnALine = words.split(" ");
            text.add(textOnALine);
        }
        //System.out.println(text);
        return text;
    }

    public static Set<String> createDictionary() {
        int numberOfWordsInDictionary;
        String word;
        Set<String> dictionary = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the number of words in dictionary");
        numberOfWordsInDictionary = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfWordsInDictionary; i++) {
            System.out.println("Insert the word " + (i + 1) + " from " + numberOfWordsInDictionary);
            word = scanner.nextLine();
            dictionary.add(word);
        }
        // System.out.println(dictionary);
        return dictionary;
    }

}
