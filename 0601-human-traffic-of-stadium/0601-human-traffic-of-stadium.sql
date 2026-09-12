/* Write your T-SQL query statement below */

with cte1 as(
    select *
    from Stadium
    where people >= 100
),

cte2 as(
    select *,
    row_number() over(order by id) as r
    from cte1
),

cte3 as(
    select *,
    id - r  as r1
    from cte2
),

cte4 as(

    select *,
    count(r1) over(partition by r1) as c
    from cte3
)

select id, visit_date, people
from cte4
where c >= 3