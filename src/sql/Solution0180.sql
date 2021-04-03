select distinct Num as ConsecutiveNums
from Logs l
where (l.Id + 1, Num) IN (SELECT * FROM Logs)
  and (l.Id + 2, Num) IN (SELECT * FROM Logs)
