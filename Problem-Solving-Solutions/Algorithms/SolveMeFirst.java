/**
* @Author: Joakim Olsson <lomo133>
* @Date:   2019-06-29T23:41:50+02:00
 * @Last modified by:   lomo133
 * @Last modified time: 2019-06-29T23:50:49+02:00
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solveMeFirst(int a, int b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println(sum);
    }
}
