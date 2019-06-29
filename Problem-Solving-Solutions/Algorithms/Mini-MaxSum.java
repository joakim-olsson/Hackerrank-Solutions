/**
* @Author: Joakim Olsson
* @Date:   2019-06-30T00:07:00+02:00
 * @Last modified by:   Joakim Olsson
 * @Last modified time: 2019-06-30T00:07:12+02:00
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        System.out.print((long) arr[0] + arr[1] + arr[2] + arr[3] + " ");
        System.out.print((long) arr[arr.length-1] + arr[arr.length-2]
        + arr[arr.length-3] + arr[arr.length-4]);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
