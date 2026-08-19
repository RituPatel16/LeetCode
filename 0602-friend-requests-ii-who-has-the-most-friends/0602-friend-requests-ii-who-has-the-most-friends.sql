/* Write your T-SQL query statement below */

with cte as(
    select accepter_id as id
    from RequestAccepted 

    union all

    select requester_id as id
    from RequestAccepted
)

select top 1 * from (
    select id ,
    count(*) over(partition by id) as num
    from cte
) as abc
order by num desc

