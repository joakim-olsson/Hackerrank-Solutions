/**
* @Author: Joakim Olsson <lomo133>
* @Date:   2018-11-04T23:33:42+01:00
 * @Last modified by:   lomo133
 * @Last modified time: 2018-11-04T23:34:11+01:00
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = "";
        int index = A.length() - 1;

        for (int i = 0; i < A.length(); i++) {
            B += A.charAt(index);
            index--;
        }
        if (A.equals(B)) System.out.println("Yes");
        else System.out.println("No");
    }
}
