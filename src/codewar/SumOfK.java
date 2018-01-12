package codewar;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pedro de Deus
 */
public class SumOfK {

    public static Integer chooseBestSum(int t, int k, List<Integer> ls) {
//        int nL = ls.size();
//        int c = combination(ls.size(), k);
//        int count = 0;
//        List list = new ArrayList();
//        List listTotal = new ArrayList();
//        List listN = new ArrayList();
//        for (int i = 0; i <= c; i++) {
//            int total = 0;
//            listN = new ArrayList();
//            for (int u = 0; u <= k; i++) {
//                listN.add(u);
//                total += ls.get(u);
//            }
//            list.add(listN);
//
//        }

        int arr[] = {50, 55, 57, 58, 60};
        int r = 3;
        int n = arr.length;

        printCombination(arr, n, k);
        return 0;
    }

    static void combinationUtil(int arr[], int data[], int start,
            int end, int index, int r) {
        // Current combination is ready to be printed, print it
        if (index == r) {
            for (int j = 0; j < r; j++) {
                System.out.print(data[j] + " ");
            }
            System.out.println("");
            return;
        }

        // replace index with all possible elements. The condition
        // "end-i+1 >= r-index" makes sure that including one element
        // at index will make a combination with remaining elements
        // at remaining positions
        for (int i = start; i <= end && end - i + 1 >= r - index; i++) {
            data[index] = arr[i];
            combinationUtil(arr, data, i + 1, end, index + 1, r);
        }
    }

    // The main function that prints all combinations of size r
    // in arr[] of size n. This function mainly uses combinationUtil()
    static void printCombination(int arr[], int n, int r) {
        // A temporary array to store all combination one by one
        int data[] = new int[r];

        // Print all combination using temprary array 'data[]'
        combinationUtil(arr, data, 0, n - 1, 0, r);
    }

    private static Integer combination(int total, int towns) {
        int n = factorial(total);
        int p = factorial(towns);
        int m = factorial(total - towns);

        return n / (p * m);

    }

    private static Integer factorial(int n) {
        int total = 1;
        for (int i = 1; i <= n; i++) {
            total *= i;
        }
        return total;
    }

}
