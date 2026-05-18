# Write your MySQL query statement below
select p.product_id , ROUND(ifnull(sum(p.price*u.units)/sum(u.units),0),2) as average_price
from prices p 
left join unitssold u
on p.product_id = u.product_id And (u.purchase_date between p.start_date And 
p.end_date )
group by p.product_id;