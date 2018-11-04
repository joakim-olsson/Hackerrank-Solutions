/**
* @Author: Joakim Olsson <lomo133>
* @Date:   2018-11-04T23:02:02+01:00
 * @Last modified by:   lomo133
 * @Last modified time: 2018-11-04T23:02:31+01:00
*/

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        Double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
