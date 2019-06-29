/**
* @Author: Joakim Olsson
* @Date:   2019-06-30T00:11:44+02:00
 * @Last modified by:   Joakim Olsson
 * @Last modified time: 2019-06-30T00:12:43+02:00
*/

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
    * Complete the gradingStudents function below.
    */
    static int[] gradingStudents(int[] grades) {

        int[] rounded = new int[grades.length];

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < 38)
                rounded[i] = grades[i];
            else if (grades[i] % 5 > 2)
                rounded[i] = grades[i] + (5 - grades[i] % 5);
            else
                rounded[i] = grades[i];
        }
        return rounded;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] grades = new int[n];

        for (int gradesItr = 0; gradesItr < n; gradesItr++) {
            int gradesItem = Integer.parseInt(scan.nextLine().trim());
            grades[gradesItr] = gradesItem;
        }

        int[] result = gradingStudents(grades);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bw.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bw.write("\n");
            }
        }

        bw.newLine();

        bw.close();
    }
}
