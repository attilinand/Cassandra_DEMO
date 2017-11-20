package com.cassandra.first;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

public class CassandraInsertOperationDemo {
	
	public static void main(String args[]){
	
    //queries
    String query1 = "INSERT INTO emp (emp_id, emp_name, emp_city, emp_phone,  emp_sal)"
		
       + " VALUES(1,'ram', 'Hyderabad', 9848022338, 50000);" ;
                           
    String query2 = "INSERT INTO emp (emp_id, emp_name, emp_city,emp_phone, emp_sal)"
    
       + " VALUES(2,'robin', 'Hyderabad', 9848022339, 40000);" ;
         
    //Creating Cluster object
    Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
 
    //Creating Session object
    Session session = cluster.connect("FirstCassandra");

    //Executing the query
    session.execute(query1);
    session.execute(query2);
    
    session.close();
	}

}
