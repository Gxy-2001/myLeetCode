# 编写一个 SQL 查询，查找 Person 表中所有重复的电子邮箱。
select p1.Email
from Person p1,
     Person p2
where p1.Id <> p2.Id
  and p1.Email = p2.Email
group by p1.Email
/*
SELECT  Email
FROM Person
GROUP BY Email
HAVING count(Id) >1
 */