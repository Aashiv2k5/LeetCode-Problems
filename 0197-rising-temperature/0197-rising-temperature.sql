SELECT w.id
from Weather w
join Weather we
on DATEDIFF(w.recordDate,we.recordDate) = 1
where w.temperature>we.temperature 
