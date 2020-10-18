import java.util.HashMap;
import java.util.Scanner;

public class Ukol2 {
    private char[] str;

    public static void main(String[] args) {
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (var ch = 'a'; ch <= 'z';ch++) {
            charCount.put(ch, 0);
        }

        char[] str = new Scanner(System.in).nextLine().toCharArray();

        for (char ch : str) {
            Integer pocet = charCount.get(ch);
            if (pocet != null) {
                charCount.put(ch, pocet + 1);
            }
        }
        System.out.println(charCount);
    }
}
