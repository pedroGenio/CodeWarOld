package codewar;

import java.util.StringJoiner;

/**
 *
 * @author Pedro de Deus
 */
public class SpinWords {

    public String spinWords(String sentence) {
        String[] text = sentence.split(" ");
        StringJoiner newT = new StringJoiner(" ");
        for (String t : text) {
            if (t.length() < 5) {
                newT.add(t);
            } else {
                StringBuilder word = new StringBuilder();
                word.append(t);
                newT.add(word.reverse());
            }
        }

        return newT.toString();
    }

}
