-- Last updated: 7/9/2026, 9:49:07 AM
# Write your MySQL query statement below
SELECT today.id
FROM Weather yesterday 
CROSS JOIN Weather today

WHERE DATEDIFF(today.recordDate,yesterday.recordDate) = 1
    AND today.temperature > yesterday.temperature
;