/**
* @Author: Joakim Olsson <lomo133>
* @Date:   2018-11-04T23:06:28+01:00
 * @Last modified by:   lomo133
 * @Last modified time: 2018-11-04T23:06:55+01:00
*/

import java.util.*;
import java.io.*;

class Solution{

    public static void main(String []argh){

        Scanner in = new Scanner(System.in);
        int t=in.nextInt();

        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for (int j=0; j < n; j++) {
                a += (Math.pow(2,j) * b);
                System.out.print(a + " ");
            }
            System.out.println("");
        }
        in.close();

    }
}
