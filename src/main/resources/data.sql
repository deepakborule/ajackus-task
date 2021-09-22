insert into department(dept_id, dept_name) values(1001,'Human Resources');
insert into department(dept_id, dept_name) values(1002,'Public Relations');
insert into department(dept_id, dept_name) values(1003,'Marketing');
insert into department(dept_id, dept_name) values(1004,'Software Development');

insert into role(role_id, role_name) values(1001,'Admin');
insert into role(role_id, role_name) values(1002,'Manager');
insert into role(role_id, role_name) values(1003,'Executive');
insert into role(role_id, role_name) values(1004,'Developer');
insert into role(role_id, role_name) values(1005,'Project Lead');
insert into role(role_id, role_name) values(1006,'Tester');
insert into role(role_id, role_name) values(1007,'Project Manager');

insert into employee(emp_id,employee_name, dept_id) values(1001,'John Rambo',1001);
insert into employee(emp_id,employee_name, dept_id) values(1002,'John Travolta',1001);
insert into employee(emp_id,employee_name, dept_id) values(1003,'Akhandand Tripathi',1004);
insert into employee(emp_id,employee_name, dept_id) values(1004,'Salma Hayek',1001);
insert into employee(emp_id,employee_name, dept_id) values(1005,'Salman Khan',1001);

insert into employee(emp_id,employee_name, dept_id) values(1006,'Amir Khan',1002);
insert into employee(emp_id,employee_name, dept_id) values(1007,'Tom Cruise',1002);
insert into employee(emp_id,employee_name, dept_id) values(1008,'Nawazuddin Siddiqui',1002);
insert into employee(emp_id,employee_name, dept_id) values(1009,'Ranbir Kapoor',1002);

insert into employee(emp_id,employee_name, dept_id) values(1010,'Anil Kapoor',1004);
insert into employee(emp_id,employee_name, dept_id) values(1011,'Rahul Singh',1004);
insert into employee(emp_id,employee_name, dept_id) values(1012,'Kishore Kumar',1004);
insert into employee(emp_id,employee_name, dept_id) values(1013,'Alia Bhat',1004);
insert into employee(emp_id,employee_name, dept_id) values(1014,'Nora Fatehi',1004);
insert into employee(emp_id,employee_name, dept_id) values(1015,'Irrfan Khaan',1004);
insert into employee(emp_id,employee_name, dept_id) values(1016,'Hritik Roshan',1004);

insert into emp_roles(emp_id, role_id) values(1001,1001);
insert into emp_roles(emp_id, role_id) values(1001,1002);
insert into emp_roles(emp_id, role_id) values(1002,1001);
insert into emp_roles(emp_id, role_id) values(1002,1003);
insert into emp_roles(emp_id, role_id) values(1002,1005);
insert into emp_roles(emp_id, role_id) values(1003,1004);
insert into emp_roles(emp_id, role_id) values(1003,1006);
insert into emp_roles(emp_id, role_id) values(1003,1007);
insert into emp_roles(emp_id, role_id) values(1004,1002);
insert into emp_roles(emp_id, role_id) values(1004,1005);
insert into emp_roles(emp_id, role_id) values(1005,1004);
insert into emp_roles(emp_id, role_id) values(1005,1005);
insert into emp_roles(emp_id, role_id) values(1005,1006);
insert into emp_roles(emp_id, role_id) values(1005,1007);
insert into emp_roles(emp_id, role_id) values(1006,1001);
insert into emp_roles(emp_id, role_id) values(1006,1003);
insert into emp_roles(emp_id, role_id) values(1006,1004);
insert into emp_roles(emp_id, role_id) values(1007,1002);
insert into emp_roles(emp_id, role_id) values(1008,1001);
insert into emp_roles(emp_id, role_id) values(1008,1003);
insert into emp_roles(emp_id, role_id) values(1009,1002);
insert into emp_roles(emp_id, role_id) values(1009,1003);
insert into emp_roles(emp_id, role_id) values(1010,1001);
insert into emp_roles(emp_id, role_id) values(1011,1004);
insert into emp_roles(emp_id, role_id) values(1011,1005);
insert into emp_roles(emp_id, role_id) values(1011,1006);
insert into emp_roles(emp_id, role_id) values(1012,1005);
insert into emp_roles(emp_id, role_id) values(1012,1006);
insert into emp_roles(emp_id, role_id) values(1013,1007);
insert into emp_roles(emp_id, role_id) values(1014,1005);
insert into emp_roles(emp_id, role_id) values(1015,1006);
insert into emp_roles(emp_id, role_id) values(1015,1007);
insert into emp_roles(emp_id, role_id) values(1016,1001);
insert into emp_roles(emp_id, role_id) values(1016,1002);
insert into emp_roles(emp_id, role_id) values(1016,1005);
insert into emp_roles(emp_id, role_id) values(1016,1007);


