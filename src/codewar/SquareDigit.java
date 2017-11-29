package codewar;

/**
 *
 * @author Pedro de Deus
 */
public class SquareDigit {

    public int squareDigits(int n) {
        String num = String.valueOf(n);
        String square = "";
        for (char na : num.toCharArray()) {
            int i = Character.getNumericValue(na);
            int i2 = i * i;
            square = square + String.valueOf(i2);
        }

        int teste = Integer.valueOf(square);

        return teste;
    }

}
