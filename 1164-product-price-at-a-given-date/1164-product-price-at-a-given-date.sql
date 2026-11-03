/* Write your T-SQL query statement below */


with cte as(
    select product_id, new_price as price, 
    row_number() over(partition by product_id order by change_date desc) as rn
    from Products 
    where change_date <= '2019-08-16'
)


select p.product_id, (case when price is null then 10 else price end) as price
    from (select distinct product_id from products) as p
left join cte
on p.product_id = cte.product_id
and cte.rn = 1;


