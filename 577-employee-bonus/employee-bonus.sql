select name ,bonus  
from Employee 
left join Bonus  on 
employee.empId=bonus.empId
where (bonus<1000 or bonus is null)



