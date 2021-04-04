/*
 编写一个 SQL 查询，找出每个部门工资最高的员工。
 */
select d.Name as `Department`, e1.Name as `Employee`, e1.Salary
from Employee e1,
     Department d
where e1.DepartmentId = d.Id
  and e1.Salary >= ALL (
    select e2.Salary
    from Employee e2
    where e1.DepartmentId = e2.DepartmentId
)