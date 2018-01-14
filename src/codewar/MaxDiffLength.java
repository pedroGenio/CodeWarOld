package codewar;

/**
 *
 * @author Pedro Elias
 */
public class MaxDiffLength {

    public static int mxdiflg(String[] a1, String[] a2) {
        int maior = -1;
        for (String x : a1) {
            for (String y : a2) {
                int abs = Math.abs(x.length() - y.length());
                if (abs > maior) {
                    maior = abs;
                }
            }
        }
        return maior;
    }

}
