/**
* @Author: Joakim Olsson <lomo133>
* @Date:   2018-11-04T23:05:24+01:00
 * @Last modified by:   lomo133
 * @Last modified time: 2018-11-04T23:05:42+01:00
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();

        for (int i = 1; 10 >= i; i++) {
            System.out.println(N + " x " + i + " = " + N * i);
        }
    }
}
