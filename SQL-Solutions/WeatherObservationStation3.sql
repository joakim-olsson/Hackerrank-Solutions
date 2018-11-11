/**
* @Author: Joakim Olsson <lomo133>
* @Date:   2018-11-11T01:34:24+01:00
 * @Last modified by:   lomo133
 * @Last modified time: 2018-11-11T01:36:11+01:00
*/

SELECT DISTINCT city
FROM station
WHERE id % 2 = 0;
