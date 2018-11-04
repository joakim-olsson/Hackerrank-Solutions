/**
* @Author: Joakim Olsson <lomo133>
* @Date:   2018-11-04T22:58:57+01:00
 * @Last modified by:   lomo133
 * @Last modified time: 2018-11-04T22:59:21+01:00
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
        int a = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();

        if (a % 2 == 1) {
            System.out.println("Weird");
        } else if (a <= 5 ) {
            System.out.println("Not Weird");
        } else if (a <= 20) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }
    }
}
