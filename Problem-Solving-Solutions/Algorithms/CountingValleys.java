/**
* @Author: Joakim Olsson
* @Date:   2019-06-30T00:21:27+02:00
 * @Last modified by:   Joakim Olsson
 * @Last modified time: 2019-06-30T00:21:45+02:00
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int height = 0;
        int valleys = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'D')
                height--;
            else if (s.charAt(i) == 'U' && height == -1) {
                valleys++;
                height++;
            }
            else
                height++;
        }
        return valleys;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
