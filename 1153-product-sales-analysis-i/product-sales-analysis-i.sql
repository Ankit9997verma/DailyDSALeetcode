# Write your MySQL query statement below
select 
pt.product_name as product_name , st.year as year , st.price as price 
from sales st
left join  product pt
on st.product_id = pt.product_id 