create database ustwave45;
create database ustset;
use ustwave45;

select database();

create table employee(
id integer primary key,
ename varchar (255) not null,
phone bigint(10) not null,
salary decimal(10,2) not null,
dateOfJoining date not null
);
insert into employee(id,ename,phone,salary,dateOfJoining)values(101,'Mallika',123456,45435.46,'2021-01-01');
insert into employee(id,ename,phone,salary,dateOfJoining)values(102,'Rahil',12345665,895435.46,'2021-02-01');
insert into employee(id,ename,phone,salary,dateOfJoining)values(103,'Sahil',126655,645765.66,'2021-02-05');
insert into employee(id,ename,phone,salary,dateOfJoining)values(104,'Mohit',45655,64567565.86,'2021-02-04');

select * from employee;
select * from employee where id=105;
select id,ename from employee;
select * from employee where salary>=645789;
select * from employee where ename not like 'M%';
select * from employee where id between 101 and 103;
select * from employee where id not between 101 and 103;
select * from employee where phone is null;
select * from employee where phone is not null;

Alter table employee add company varchar(255) not null default 'ust gloal';
select * from employee;
desc employee;
update employee set phone=7856546 where id=101;

select * from employee where salary in(select max(salary) from employee);
select * from employee where salary>  (select avg(salary) from employee);

alter table employee add department varchar(255) not null;
desc employee;
update employee set department='HR' where id=101;
update employee set department='HR' where id=102;
update employee set department='QA' where id=103;
update employee set department='DEV' where id=104;

select  * from employee group by department;
-- count the department--
select count(department) as No_of_Employee, department from employee group by department;
select * from employee;


