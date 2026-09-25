/* Write your T-SQL query statement below */

with cte as(
    select *,
    rank() over(partition by customer_id order by order_date) as r
    from Delivery
),
cte2 as(
    select count(case when order_date = customer_pref_delivery_date then 1 else null end) as c,
    count(*) as total
    from cte
    where r = 1
    
),
cte3 as(
    select round(100.0*c / total, 2) as immediate_percentage 
    from cte2
)

select * from cte3;