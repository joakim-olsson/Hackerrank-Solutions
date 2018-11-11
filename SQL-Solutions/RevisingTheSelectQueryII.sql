/**
* @Author: Joakim Olsson <lomo133>
* @Date:   2018-11-11T01:17:57+01:00
 * @Last modified by:   lomo133
 * @Last modified time: 2018-11-11T01:19:02+01:00
*/

SELECT name FROM CITY
WHERE countrycode = 'USA'
    AND population > 120000;
