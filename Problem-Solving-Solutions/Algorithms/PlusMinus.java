/**
* @Author: Joakim Olsson
* @Date:   2019-06-30T00:04:46+02:00
 * @Last modified by:   Joakim Olsson
 * @Last modified time: 2019-06-30T00:05:25+02:00
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int pos = 0;
        int neg = 0;
        int zero = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                pos++;
            else if (arr[i] < 0)
                neg++;
            else
                zero++;
        }
        System.out.println((float) pos / arr.length);
        System.out.println((float) neg / arr.length);
        System.out.println((float) zero / arr.length);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
