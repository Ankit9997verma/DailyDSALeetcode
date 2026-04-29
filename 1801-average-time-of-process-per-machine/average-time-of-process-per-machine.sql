# Write your MySQL query statement below
SELECT 
   a.machine_id , ROUND(AVG(b.timestamp - a.timestamp), 3) As Processing_time
   FROM Activity a
   Join Activity b
   on a.machine_id = b.machine_id
   And a.process_id = b.process_id
  AND a.activity_type = 'start'
AND b.activity_type = 'end'
GROUP BY a.machine_id;