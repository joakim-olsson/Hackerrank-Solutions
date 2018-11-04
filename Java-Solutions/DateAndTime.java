/**
* @Author: Joakim Olsson <lomo133>
* @Date:   2018-11-04T23:15:47+01:00
 * @Last modified by:   lomo133
 * @Last modified time: 2018-11-04T23:18:38+01:00
*/

import java.time.*;

public class Solution {

    public static String getDay(String day, String month, String year) {

        int d = Integer.valueOf(day);
        int m = Integer.valueOf(month);
        int y = Integer.valueOf(year);
        LocalDate date = LocalDate.of(y,m,d);

        return date.getDayOfWeek().toString();
    }
}
