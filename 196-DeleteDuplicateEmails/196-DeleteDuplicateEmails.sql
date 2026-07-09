-- Last updated: 7/9/2026, 9:49:09 AM
# Write your MySQL query statement below
DELETE p1 FROM Person p1
JOIN Person p2
ON p1.email = p2.email AND p1.id > p2.id; 