/*
编写一个 SQL 查询，获取 Employee 表中第二高的薪水（Salary） 。
+----+--------+
| Id | Salary |
+----+--------+
| 1  | 100    |
| 2  | 200    |
| 3  | 300    |
+----+--------+
*/
select max(Salary) as SecondHighestSalary
from Employee
where Salary < (
    select max(Salary)
    from Employee
);