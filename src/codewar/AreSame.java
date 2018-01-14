package codewar;

import java.util.Arrays;

/**
 *
 * @author Pedro Elias
 */
public class AreSame {

    /**
     *  int[] a = {121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = {121, 14641, 20736, 361, 25921, 361, 20736, 361};
        int[] c = {};
        int[] d = {};
     * @param a
     * @param b
     * @return 
     */
    public static boolean comp(int[] a, int[] b) {
        if (a == null || b == null) {
            return false;
        }
        if (a.length != b.length) {
            return false;
        }

        int[] sortedA = Arrays.stream(a).map(x -> x * x).sorted().toArray();
        int[] sortedB = Arrays.stream(b).sorted().toArray();
        return Arrays.equals(sortedA, sortedB);

    }

}
