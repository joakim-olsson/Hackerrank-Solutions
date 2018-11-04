/**
* @Author: Joakim Olsson <lomo133>
* @Date:   2018-11-04T23:41:08+01:00
 * @Last modified by:   lomo133
 * @Last modified time: 2018-11-04T23:42:07+01:00
*/

import java.util.*;
import java.io.*;

class Solution {
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> phoneBook = new HashMap<>();
        int n = in.nextInt();
        in.nextLine();
        for(int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine();
            phoneBook.put(name, phone);

        }
        while(in.hasNext()) {
            String s = in.nextLine();

            System.out.println(phoneBook.containsKey(s) ? s + "=" + phoneBook.get(s) :
            "Not found");
        }
    }
}
