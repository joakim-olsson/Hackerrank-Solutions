/**
* @Author: Joakim Olsson
* @Date:   2019-06-30T00:05:57+02:00
 * @Last modified by:   Joakim Olsson
 * @Last modified time: 2019-06-30T00:06:17+02:00
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the staircase function below.
    static void staircase(int n) {
        for (int i = 1; i <= n; i++) {
            String stairs = "";
            StringBuilder builder = new StringBuilder(stairs);
            
            for (int j = n; j > i; j--) {
                builder.append(" ");
            }
            for (int j = 0; j < i; j++) {
                builder.append('#');
            }
            System.out.println(builder.toString());
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
