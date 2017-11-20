package com.cassandra.first;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Session;

public class CassandraSelectOperationDemo {
	
	public static void main(String args[]){
		
		 String query = "select * from emp WHERE emp_name='ram'";
//		 Query scan = new SimpleStatement("select * from emp WHERE emp_name='ram'");

	         
	    //Creating Cluster object
	    Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
	 
	    //Creating Session object
	    Session session = cluster.connect("FirstCassandra");

	    //Executing the query
	  ResultSet resultSet=  session.execute(query);
	  System.out.println("The data retreived is :" +resultSet.all());
	    
	    session.close();
		}

}
