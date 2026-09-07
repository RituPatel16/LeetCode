CREATE FUNCTION getNthHighestSalary(@N INT) RETURNS INT
BEGIN
  RETURN (
    

    select top 1 salary as getNthHighestSalary from
      (select salary,
      dense_rank() over(order by salary desc) as r
      from employee) as abc
      where r = @N

  );
END