package codewar;

/**
 *
 * @author Pedro Elias
 */
public class TrailingZeros {

    /**
     * http://www.geeksforgeeks.org/count-trailing-zeroes-factorial-number/
     * @param n
     * @return 
     */
    public static int zeros(int n) {

        int count = 0;
        for (int i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }
        return count;
    }

}
