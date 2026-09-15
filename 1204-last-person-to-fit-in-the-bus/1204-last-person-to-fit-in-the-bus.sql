/* Write your T-SQL query statement below */
with cte as(
    select *,
    sum(Weight) over(order by turn) as total
    from Queue
)
select top 1 person_name 
from cte
where total <= 1000
order by turn desc