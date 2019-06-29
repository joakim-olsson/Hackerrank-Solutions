/**
* @Author: Joakim Olsson
* @Date:   2019-06-30T00:23:47+02:00
 * @Last modified by:   Joakim Olsson
 * @Last modified time: 2019-06-30T00:25:11+02:00
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

class Result {

    /*
    * Complete the 'pickingNumbers' function below.
    *
    * The function is expected to return an INTEGER.
    * The function accepts INTEGER_ARRAY a as parameter.
    */

    public static int pickingNumbers(List<Integer> a) {
        int[] freqs = new int[100];
        int max = 0;

        for (Integer i : a) {
            freqs[i]++;
        }
        for (int i = 1; i < freqs.length; i++) {
            if (freqs[i] + freqs[i-1] > max)
                max = freqs[i] + freqs[i-1];
        }
        return max;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        .map(Integer::parseInt)
        .collect(toList());

        int result = Result.pickingNumbers(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
