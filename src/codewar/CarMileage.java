package codewar;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Pedro Elias
 */
public class CarMileage {

    public static int isInteresting(int number, int[] awesomePhrases) {
        Integer value = null;

        if (number <= 97) {
            return 0;
        }
        if (number >= 97 && number <= 99) {
            value = 0;
        }
        if (value == null) {
            value = test(number, awesomePhrases, false);
        }
        if (value == 0) {
            value = almostAdd(number, awesomePhrases, true);
        }
        if (value == 0) {
            value = almostMinus(number, awesomePhrases, true);
        }

        return value;
    }

    private static int almostAdd(int number, int[] awesomePhrases, boolean almost) {
        int value = 0;
        int count = 0;
        int temp = number;
        while (count < 2) {
            temp++;
            value = test(temp, awesomePhrases, almost);
            if (value == 2 || value == 1) {
                break;
            }
            count++;
        }
        return value;
    }

    private static int almostMinus(int number, int[] awesomePhrases, boolean almost) {
        int value = 0;
        int count = 0;
        int temp = number;
        while (count < 2) {
            temp--;
            value = test(temp, awesomePhrases, almost);
            if (value == 2 || value == 1) {
                break;
            }
            count++;
        }
        return value;
    }

    private static int test(int number, int[] awesomePhrases, boolean almost) {
        Integer value = 0;
        String[] s = String.valueOf(number).split("");
        List l = Stream.of(String.valueOf(number).split(""))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int r = reverseNumber(number);
        if (sequentialIncrement(l)) {
            value = almost ? 1 : 2;
        } else if (sequentialDecrement(l)) {
            value = almost ? 1 : 2;
        } else if (number == r) {
            value = almost ? 1 : 2;
        } else if (allZeros(number)) {
            value = almost ? 1 : 2;
        } else if (awesomePhrases(number, awesomePhrases)) {
            value = almost ? 1 : 2;
        }
        return value;
    }

    private static boolean awesomePhrases(int number, int[] awesomePhrases) {
        for (int i : awesomePhrases) {
            if (i == number) {
                return true;
            }
        }
        return false;
    }

    private static boolean allZeros(int number) {
        String num = String.valueOf(number);
        String last = num.substring(1, num.length());

        if (Integer.valueOf(last).equals(0)) {
            return true;
        }
        return false;
    }

    /**
     * BEST PRACTICE 
     * String s = "1234567890";
        return s.contains(digits);
     * @param list
     * @return 
     */
    private static boolean sequentialIncrement(List<Integer> list) {
        Integer prev = null;
        int seq = 0;
        for (Integer i : list) {
            if (prev != null && ((i == 0 & prev + 1 == 10) || prev + 1 == i)) {
                seq = seq == 0 ? 2 : seq + 1;
            } else if (prev != null) {
                return false;
            }
            prev = i;
        }
        return seq >= 1;
    }

    /**
     * BEST PRACTICE
     *  String s = "9876543210";
        return s.contains(digits);
     * @param list
     * @return 
     */
    private static boolean sequentialDecrement(List<Integer> list) {
        Integer prev = null;
        int seq = 0;
        for (Integer i : list) {
            if (prev != null && prev - 1 == i) {
                seq = seq == 0 ? 2 : seq + 1;
            } else if (prev != null) {
                return false;
            }
            prev = i;
        }
        return seq >= 1;
    }

    private static int reverseNumber(int num) {
        int reversenum = 0;

        while (num != 0) {
            reversenum = reversenum * 10;
            reversenum = reversenum + num % 10;
            num = num / 10;
        }

        return reversenum;
    }

}
