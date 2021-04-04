/*
编写一个 SQL 查询，获取 Employee 表中第 n 高的薪水（Salary）。

+----+--------+
| Id | Salary |
+----+--------+
| 1  | 100    |
| 2  | 200    |
| 3  | 300    |
+----+--------+
例如上述 Employee 表，n = 2 时，应返回第二高的薪水 200。如果不存在第 n 高的薪水，那么查询应返回 null。

+------------------------+
| getNthHighestSalary(2) |
+------------------------+
| 200                    |
+------------------------+
*/

CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
    SET N := N - 1;
    RETURN (
        SELECT salary
        FROM employee
        GROUP BY salary
        ORDER BY salary DESC
        LIMIT N, 1
    );
END
/*
CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      # Write your MySQL query statement below.
      SELECT
          e1.salary
      FROM
          employee e1 JOIN employee e2 ON e1.salary <= e2.salary
      GROUP BY
          e1.salary
      HAVING
          count(DISTINCT e2.salary) = N
  );
END
*/
