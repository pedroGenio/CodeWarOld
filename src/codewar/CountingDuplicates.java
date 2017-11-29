package codewar;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Pedro de Deus
 */
public class CountingDuplicates {

    public static int duplicateCount(String text) {
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        char[] arr = text.toCharArray();

        for (char value : arr) {
            value = Character.toLowerCase(value);
            if (Character.isAlphabetic(value)) {
                if (charMap.containsKey(value)) {
                    charMap.put(value, charMap.get(value) + 1);

                } else {
                    charMap.put(value, 1);
                }
            }
        }
        int count = 0;
        Iterator<Map.Entry<Character, Integer>> it = charMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Character, Integer> pair = it.next();
            if (pair.getValue() > 1) {
                count++;
            }
        }

        // System.out.println(charMap);
        return count;
    }

}
