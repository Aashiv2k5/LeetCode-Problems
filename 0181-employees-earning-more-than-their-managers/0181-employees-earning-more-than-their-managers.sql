SELECT ee.name as Employee 
FROM Employee e
join Employee ee
on e.id = ee.managerId
where e.salary < ee.salary
