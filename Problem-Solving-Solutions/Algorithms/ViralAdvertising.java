/**
* @Author: Joakim Olsson
* @Date:   2019-06-30T00:29:34+02:00
 * @Last modified by:   Joakim Olsson
 * @Last modified time: 2019-06-30T00:29:44+02:00
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the viralAdvertising function below.
    static int viralAdvertising(int n) {
        int people = 5;
        int likes = 0;
        for (int i = 0; i < n; i++){
            people = people/2;
            likes += people;
            people *= 3;
        }
        return likes;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = viralAdvertising(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
