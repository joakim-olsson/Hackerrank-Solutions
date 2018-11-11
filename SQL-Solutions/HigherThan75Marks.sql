/**
* @Author: Joakim Olsson <lomo133>
* @Date:   2018-11-11T01:38:44+01:00
 * @Last modified by:   lomo133
 * @Last modified time: 2018-11-11T01:38:50+01:00
*/

SELECT Name
FROM Students
WHERE Marks > 75
ORDER BY RIGHT (Name, 3), ID;
