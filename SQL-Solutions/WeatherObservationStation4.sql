/**
* @Author: Joakim Olsson <lomo133>
* @Date:   2018-11-11T01:35:36+01:00
 * @Last modified by:   lomo133
 * @Last modified time: 2018-11-11T01:35:44+01:00
*/

SELECT COUNT(city) - COUNT(DISTINCT city)
FROM station;
