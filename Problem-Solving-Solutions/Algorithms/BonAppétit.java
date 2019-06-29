/**
* @Author: Joakim Olsson
* @Date:   2019-06-30T00:18:45+02:00
 * @Last modified by:   Joakim Olsson
 * @Last modified time: 2019-06-30T00:19:28+02:00
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    // Complete the bonAppetit function below.
    static void bonAppetit(List<Integer> bill, int k, int b) {

        int charge = (sum(bill) - bill.get(k)) / 2;

        System.out.println(charge == b
        ? "Bon Appetit"
        : Math.abs(charge-b));
    }

    private static int sum(List<Integer> bill) {
        if (bill == null || bill.size() < 1)
            return 0;

        int sum = 0;
        for (int i : bill) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] nk = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        List<Integer> bill = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        .map(Integer::parseInt)
        .collect(toList());

        int b = Integer.parseInt(bufferedReader.readLine().trim());

        bonAppetit(bill, k, b);

        bufferedReader.close();
    }
}
