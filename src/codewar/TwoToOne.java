package codewar;

import java.util.Arrays;
import java.util.TreeSet;

/**
 *
 * @author Pedro Elias
 */
public class TwoToOne {

    public static String longest(String s1, String s2) {
        s1 += s2;
        String[] arrays = new TreeSet<>(Arrays.asList(s1.split(""))).toArray(new String[0]);
        String saida = String.join("", arrays);
        //System.out.println(saida);

        return saida;
    }

}
