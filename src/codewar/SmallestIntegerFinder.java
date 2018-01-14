package codewar;

/**
 *
 * @author Pedro Elias
 */
public class SmallestIntegerFinder {

    public static int findSmallestInt(int[] args) {

        int menor = Integer.MAX_VALUE;
        for (int i : args) {
            if (i < menor) {
                menor = i;
            }
        }
        return menor;

    }

}
