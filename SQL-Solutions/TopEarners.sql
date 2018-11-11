/**
* @Author: Joakim Olsson <lomo133>
* @Date:   2018-11-11T01:41:31+01:00
 * @Last modified by:   lomo133
 * @Last modified time: 2018-11-11T01:41:36+01:00
*/

SELECT (salary * months) AS earnings, COUNT(*)
FROM Employee
GROUP BY 1
ORDER BY 1
DESC LIMIT 1;
