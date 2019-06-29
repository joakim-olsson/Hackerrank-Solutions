/**
 * @Author: Joakim Olsson
 * @Date:   2019-06-30T00:09:33+02:00
 * @Last modified by:   Joakim Olsson
 * @Last modified time: 2019-06-30T00:10:17+02:00
 */

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        if (s.contains("PM")) {
            int newTime = Integer.parseInt(s.substring(0, 2)) + 12;
            if (newTime >= 24)
                return "12" + s.substring(2, s.length()-2);
        String numberStr = Integer.toString(newTime);
        return numberStr + s.substring(2, s.length()-2);
        } else {
            if (s.substring(0,2).equals("12"))
                return "00" + s.substring(2, s.length()-2);
            return s.substring(0, s.length()-2);
        }
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
