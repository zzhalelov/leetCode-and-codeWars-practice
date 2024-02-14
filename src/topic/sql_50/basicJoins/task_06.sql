--Write a solution to show the unique ID of each user,
-- If a user does not have a unique ID replace just show null.
SELECT eu.unique_id AS unique_id,
       e.name       AS name
FROM Employees e
         LEFT JOIN EmployeeUNI eu ON e.id = eu.id;
