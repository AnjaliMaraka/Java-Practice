-- Table Name: Employee
-- Columns:    Employee_id, Employee_name, salary, Department_name, emp_address,  joiningdate

-- 1.Write a  query to insert 10 records in to the Employee table.
create table Employee(Employee_id int,Employee_name varchar(220),salary int,Department_name varchar(220),emp_address varchar(220),joiningdate varchar(220));
insert into Employee values(1,"abc",2000,"cse","xyz","12-02-2012"),(2,"cde",5000,"eee","pqr","11-12-2012"),(3,"efg",4000,"cse","stu","02-03-2012"),(4,"hij",3000,"ece","vwx","22-04-2012"),(5,"klm",6000,"cse","bkh","30-02-2012"),(6,"nop",5000,"it","opr","12-05-2012"),(7,"qrs",2000,"ece","klf","16-07-2012"),(8,"tuv",9000,"cse","gtr","17-09-2012"),(9,"wxy",6000,"eee","ytu","24-05-2012"),(10,"zab",4000,"ece","fgh","22-08-2012");