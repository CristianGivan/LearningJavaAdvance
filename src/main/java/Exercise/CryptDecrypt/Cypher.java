package Exercise.CryptDecrypt;

import java.util.HashMap;
import java.util.Map;

public class Cypher {
//todo check if encrypted character exist


    public static Map<Character, Character> initializeCypher() {
        Map<Character, Character> cypher = new HashMap<>();
        cypher.put('a', 's');
        cypher.put('e', 't');
        cypher.put('i', 'n');
        cypher.put('o', 'f');
        cypher.put('u', 'g');
        cypher.put('c', 'h');
        cypher.put('n', 'j');
        cypher.put('d', 'k');
        cypher.put('b', 'x');
        cypher.put('s', 'y');
        cypher.put('l', 'z');
        cypher.put('m', 'q');
        return cypher;
    }

    public static String encrypt(Map<Character, Character> cypher, String word) {
        String encryptedWord = "";
        Character wordChar;
        Character encryptedChar;
        for (int i = 0; i < word.length(); i++) {
            wordChar = word.charAt(i);
            encryptedChar = cypher.get(wordChar);
            encryptedWord = encryptedWord + encryptedChar;
        }

        return encryptedWord;
    }

    public static String decrypt(Map<Character, Character> cypher, String word) {
        String encryptedWord = "";
        Character wordChar;
        Character encryptedChar = null;
        for (int i = 0; i < word.length(); i++) {
            wordChar = word.charAt(i);
            for (Map.Entry<Character, Character> entry : cypher.entrySet()) {
                if (wordChar.equals(entry.getValue())) {
                    encryptedChar = entry.getKey();
                    break;
                }
            }
            encryptedWord = encryptedWord + encryptedChar;
        }

        return encryptedWord;
    }
}
