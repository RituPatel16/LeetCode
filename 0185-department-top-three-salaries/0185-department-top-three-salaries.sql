/* Write your T-SQL query statement below */
select Department, Employee, Salary from(
    select d.name as Department, e.name as Employee, Salary ,
    dense_rank() over(partition by d.name order by salary desc) as rn
    from Employee e
    join Department d
    on e.departmentId = d.id
    
) as abc
where rn <=3
