package Exercise.CryptDecrypt;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Character, Character> cypher = Cypher.initializeCypher();
        System.out.println(cypher);
        String encryptedWord;
        String decryptedWord;
        System.out.println("slab");
        encryptedWord=Cypher.encrypt(cypher,"slab");
        System.out.println(encryptedWord);
        decryptedWord=Cypher.decrypt(cypher,"yzsx");
        System.out.println(decryptedWord);
        decryptedWord=Cypher.decrypt(cypher,"qsjs");
        System.out.println(decryptedWord);


    }
}
