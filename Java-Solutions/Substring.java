/**
* @Author: Joakim Olsson <lomo133>
* @Date:   2018-11-04T23:37:52+01:00
 * @Last modified by:   lomo133
 * @Last modified time: 2018-11-04T23:38:06+01:00
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        System.out.println(S.substring(start, end));
    }
}
