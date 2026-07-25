/* Write your T-SQL query statement below */
select s.user_id, 
round(case when count(c.action) = 0 then 0 
else sum(case when c.action = 'confirmed' then 1.0 else 0 end) / count(c.action) end , 2) as confirmation_rate 
from Signups s
left outer join Confirmations c
on s.user_id = c.user_id 
group by s.user_id



