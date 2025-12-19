# Write your MySQL query statement below
SELECT Department.name AS Department,Employee.name AS Employee ,Employee.salary AS Salary
FROM Employee
INNER JOIN Department ON Employee.departmentId=Department.id
WHERE Employee.salary=(SELECT MAX(e2.salary)
    FROM Employee e2
    WHERE e2.departmentId = Employee.departmentId
    )
    
;
