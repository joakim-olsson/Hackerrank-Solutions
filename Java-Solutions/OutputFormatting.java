/**
* @Author: Joakim Olsson <lomo133>
* @Date:   2018-11-04T23:04:04+01:00
 * @Last modified by:   lomo133
 * @Last modified time: 2018-11-04T23:04:27+01:00
*/

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();

            int amountOfSpaces = 15 - s1.length();
            int n = amountOfSpaces;
            String existing_string = "";
            StringBuilder builder = new StringBuilder(existing_string);
            for (int j = 0; j < n; j++) {
                builder.append(" ");
            }
            System.out.print(s1 + builder);
            if (x < 10) {
                System.out.println("00" + x);
            } else if (x < 100) {
                System.out.println("0" + x);
            } else {
                System.out.println(x);
            }
        }
        System.out.println("================================");
    }
}
