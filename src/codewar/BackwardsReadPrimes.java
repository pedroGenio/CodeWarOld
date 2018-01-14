package codewar;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * System.out.println(BackwardsReadPrimes.backwardsPrime(70000, 70245));
 * @author Pedro Elias
 */
public class BackwardsReadPrimes {

    public static String backwardsPrime(long start, long end) {
        List<Long> prime1 = prime(start, end);
        List<Long> newList = new ArrayList();
        prime1.forEach((i) -> {
            long r = reverseNumber(i);
            if (!i.equals(r) && isPrime(r)) {
                newList.add(i);
            }
        });
        String s = newList.stream().sorted().map(Object::toString).collect(Collectors.joining(" "));
        return s;
    }

    private static long reverseNumber(long num) {
        long reversenum = 0;

        while (num != 0) {
            reversenum = reversenum * 10;
            reversenum = reversenum + num % 10;
            num = num / 10;
        }

        return reversenum;
    }

    private static boolean isPrime(Long n) {
//        int counter = 0;
//        for (long num = n; num >= 1; num--) {
//            if (n % num == 0) {
//                counter = counter + 1;
//            }
//        }
//        return counter == 2;
        int number = n.intValue();
        return IntStream.rangeClosed(2, number  / 2).noneMatch(i -> n % i == 0);
    }

    public static List<Long> prime(long start, long end) {
        List a = new ArrayList();
        for (long i = start; i <= end; i++) {
            if (i > 10) {
                if (isPrime(i)) {
                    a.add(i);
                }
            }
        }

        return a;
    }

}
