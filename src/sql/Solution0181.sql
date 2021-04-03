/*select e.Name as Employee
from Employee e
where e.Salary > (
    select e1.Salary
    from Employee e1
    where e1.Id = e.ManagerId
);*/
SELECT
    a.Name AS 'Employee'
FROM
    Employee AS a,
    Employee AS b
WHERE
    a.ManagerId = b.Id
        AND a.Salary > b.Salary
;