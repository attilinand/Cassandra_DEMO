Download Setup of cassandra from the following link:

https://academy.datastax.com/planet-cassandra/cassandra

Install it using windows installer.

Once done create a key space which is similar to DB in the sql or oracle.

Cassandra has CQL language and CQL shell utility to run the query and to create keyspace.

create keyspace with the following command
create keyspace hr with replication={'class':'SimpleStrategy', 'replication_factor':1};
Once a keyspace is created, you can create column families (the primary data object in Cassandra), insert data, query data
create table emp
         ... (empid int primary key,
         ... emp_first varchar,
         ... emp_last varchar,
         ... emp_dept varchar);
insert into emp (empid, emp_first, emp_last, emp_dept)
         ... values (1, 'Sachin', 'Tendulkar', 'GOD');
		 
select * from emp;should give us the the data in the table. 


To Run the Java programs using Cassandra
Import the project and Maven and once done you can directly run the programs.

The programs include basic operations and like creating the keyspace and table,inserting data into table.
		 