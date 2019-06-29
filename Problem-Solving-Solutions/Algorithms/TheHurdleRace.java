/**
* @Author: Joakim Olsson
* @Date:   2019-06-30T00:25:38+02:00
 * @Last modified by:   Joakim Olsson
 * @Last modified time: 2019-06-30T00:26:03+02:00
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the hurdleRace function below.
    static int hurdleRace(int k, int[] height) {
        if (k >= maxHeight(height))
            return 0;
        else
            return maxHeight(height) - k;
    }

    private static int maxHeight(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            if (height[i] > max)
                max = height[i];
        }
        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] height = new int[n];

        String[] heightItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int heightItem = Integer.parseInt(heightItems[i]);
            height[i] = heightItem;
        }

        int result = hurdleRace(k, height);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
