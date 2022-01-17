package HW10;

import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
public class HW10 {
    public static void main(String[] args) {

        String []arrayWord = {"cat", "dog", "fish", "hose", "room",
            "crocodile", "house", "apple", "potato", "cat", "room" };
        Set<String> word = new HashSet<>();
        for(int i = 0; i < arrayWord.length; i++) {
            word.add(arrayWord[i]);
        }
        System.out.println(word);
    }
}