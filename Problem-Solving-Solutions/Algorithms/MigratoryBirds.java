/**
* @Author: Joakim Olsson
* @Date:   2019-06-30T00:18:02+02:00
 * @Last modified by:   Joakim Olsson
 * @Last modified time: 2019-06-30T00:18:12+02:00
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
import java.util.Map.Entry;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
        Collections.sort(arr);
        int maxNumber = arr.get(0);
        int counter = 1;
        int maxCounter = -1;

        for (int i = 1; i < arr.size(); i++) {
            counter = (arr.get(i) == arr.get(i-1)) ? counter + 1 :  1;
            if (counter > maxCounter) {
                maxCounter = counter;
                maxNumber = arr.get(i);
            }
        }
        return maxNumber;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        .map(Integer::parseInt)
        .collect(toList());

        int result = migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
