/*
 如果两个分数相同，则两个分数排名（Rank）相同。请注意，
 平分后的下一个名次应该是下一个连续的整数值。换句话说，名次之间不应该有“间隔”。
 */
select s1.score, count(distinct (s2.score)) as `Rank`
from Scores s1,
     Scores s2
where s1.score <= s2.score
group by s1.Id
order by `Rank`;