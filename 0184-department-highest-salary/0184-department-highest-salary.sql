SELECT d.name as Department , e.name as Employee , e.salary
FROM Employee e, Department d
where e.departmentId=d.id
AND (departmentId , salary) IN (
    select departmentId , max(salary)  from employee group by departmentId 

)


