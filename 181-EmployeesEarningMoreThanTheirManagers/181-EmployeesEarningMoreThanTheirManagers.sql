-- Last updated: 7/9/2026, 9:49:13 AM
# Write your MySQL query statement below
SELECT e2.name as Employee
FROM employee e1
INNER JOIN employee e2 ON e1.id = e2.managerId
WHERE e1.salary < e2.salary