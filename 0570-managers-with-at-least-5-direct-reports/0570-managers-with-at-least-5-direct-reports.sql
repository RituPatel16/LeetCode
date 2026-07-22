/* Write your T-SQL query statement below */
select e.name
from Employee e
join Employee m
on e.id = m.managerId
group by e.name,e.id
having count(m.id) >= 5

