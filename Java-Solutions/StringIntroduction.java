/**
* @Author: Joakim Olsson <lomo133>
* @Date:   2018-11-04T23:36:56+01:00
 * @Last modified by:   lomo133
 * @Last modified time: 2018-11-04T23:37:14+01:00
*/


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        System.out.println(A.length() + B.length());

        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");

        System.out.println(A.substring(0,1).toUpperCase() + A.substring(1)
        + " " +
        B.substring(0,1).toUpperCase() + B.substring(1));
    }
}
