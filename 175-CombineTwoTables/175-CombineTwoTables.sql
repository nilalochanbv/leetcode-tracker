-- Last updated: 7/9/2026, 9:49:20 AM
# Write your MySQL query statement below
SELECT p.firstname,p.lastname,a.city,a.state
FROM Person p
LEFT JOIN Address a ON p.personID = a.PersonID;