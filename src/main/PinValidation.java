
package src.main;

import java.util.HashMap;
import java.util.Map;

public class PinValidation {
    public static void main(String args[]) {
        System.out.println("Please enter input: ");
        String input = args[0];
        String output = "Valid number";
        if (!pin(input))
            output = "Invalid number";
        System.out.println(output);
    }

    public static boolean pin(String entry) {
        char[] literals = entry.toCharArray();
        boolean check = true;
        boolean consecutive = false;
        Map<Character, Integer> litMap = new HashMap<Character, Integer>();
        Map<Integer, Integer> charMap = new HashMap<Integer, Integer>();

        for (Character ch : literals) {
            if (litMap.containsKey(ch)) {
                litMap.put(ch, litMap.get(ch) + 1);
            } else {
                litMap.put(ch, 1);
            }
        }

        for (Map.Entry<Character, Integer> val : litMap.entrySet()) {
            if (val.getValue() > 2)
                check = false;
        }

        for (int i = 1; i < literals.length; i++) {

            if ((literals[i] - literals[i - 1]) == 1) {
                if (charMap.containsKey(1)) {
                    charMap.put(1, charMap.get(1) + 1);
                } else {
                    charMap.put(1, 1);
                }

            } else if ((literals[i] - literals[i - 1]) == -1) {
                if (charMap.containsKey(-1)) {
                    charMap.put(-1, charMap.get(-1) + 1);
                } else {
                    charMap.put(-1, 1);
                }
            } else {
                charMap.put(-1, 1);
                charMap.put(1, 1);
            }
        }

        if (charMap.values().size() == 1)
            consecutive = false;
        else
            consecutive = true;

        return (consecutive && check);
    }

}
