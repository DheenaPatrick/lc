# Write your MySQL query statement below
# we want salary rank by department id/name, so that we have to use partition by 
# Window function 
# dense_rank() -> give top 1223
# partition by 
select d.name as Department, e.name as Employee, e.salary as Salary
from 
    (Select departmentId, name, salary,     
    dense_rank() over ( 
        partition by departmentId   
        order by salary desc    
        ) as rank1
    from Employee
    ) e 
join department d
on e.departmentId = d.id
where e.rank1 <= 3 