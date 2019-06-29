/**
* @Author: Joakim Olsson
* @Date:   2019-06-30T00:28:45+02:00
 * @Last modified by:   Joakim Olsson
 * @Last modified time: 2019-06-30T00:29:09+02:00
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {

        int ans = 0;

        for (int p = 0; p <= j-i; p++) {
            if (Math.abs(i+p-reversedNumb(i+p))%k == 0)
                ans++;
        }
        return ans;
    }

    private static int reversedNumb(int num) {
        int reverse = 0;
        while (num != 0) {
            reverse *= 10;
            reverse = reverse + num % 10;
            num /= 10;
        }
        return reverse;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] ijk = scanner.nextLine().split(" ");

        int i = Integer.parseInt(ijk[0]);

        int j = Integer.parseInt(ijk[1]);

        int k = Integer.parseInt(ijk[2]);

        int result = beautifulDays(i, j, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
