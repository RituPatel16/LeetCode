/* Write your T-SQL query statement below */
select Department, Employee, Salary from(
    select d.name as Department, e.name as Employee, e.salary as Salary,
    dense_Rank() over(partition by e.departmentId order by salary desc) as r
    from Employee e
    join Department d
    on e.departmentId = d.id
) as abc
where r = 1