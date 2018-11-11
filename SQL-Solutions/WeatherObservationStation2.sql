/**
* @Author: Joakim Olsson <lomo133>
* @Date:   2018-11-11T01:32:58+01:00
 * @Last modified by:   lomo133
 * @Last modified time: 2018-11-11T01:33:27+01:00
*/

SELECT ROUND(SUM(LAT_N), 2) AS lat, ROUND(SUM(LONG_W), 2) AS lon
FROM STATION;
