/**
* @Author: Joakim Olsson <lomo133>
* @Date:   2018-11-04T23:40:00+01:00
 * @Last modified by:   lomo133
 * @Last modified time: 2018-11-04T23:40:25+01:00
*/


import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        
        while (testCases > 0) {
            String pattern = in.nextLine();
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException E) {
                System.out.println("Invalid");
            }
            testCases--;
        }
    }
}
