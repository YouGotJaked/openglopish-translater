package openglopish.translater;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class OPTranslator {

    static String input;
    static String newString = "";
    static ArrayList<Character> newWord = new ArrayList<>();
    static ArrayList<Character> vowels = new ArrayList<>(Arrays.asList('a', 'i', 'e', 'o', 'u'));

    public static void main(String[] args) {
            translate(input());
            if (!truth(input)) {
                return;
            }
            System.out.println(listToStr(newWord));
    }

    public static String input() {
        System.out.print("Enter a sentence or 0 to end: ");
        Scanner s = new Scanner(System.in);
        return input = s.nextLine();
    }
    
    public static Boolean truth(String s) {
        return !s.equals("0");
    }

    public static void translate(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (vowels.contains(str.charAt(i))) {
                newWord.add('o');
                newWord.add('p');
            }
            newWord.add(str.charAt(i));
        }
    }

    public static String listToStr(ArrayList<Character> aoc) {
        for (char c : aoc) {
            newString += c;
        }
        return newString += " ";
    }
}
