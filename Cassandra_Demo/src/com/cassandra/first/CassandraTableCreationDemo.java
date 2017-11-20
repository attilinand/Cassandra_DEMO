package com.cassandra.first;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

public class CassandraTableCreationDemo {
	public static void main(String args[]){

	      //Query
	      String query = "CREATE TABLE emp(emp_id int PRIMARY KEY, "
	         + "emp_name text, "
	         + "emp_city text, "
	         + "emp_sal varint, "
	         + "emp_phone varint );";
			
	      //Creating Cluster object
	      Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
	   
	      //Creating Session object
	      Session session = cluster.connect("FirstCassandra");
	 
	      //Executing the query
	      session.execute(query);
	      
	      session.close();
	 
	      System.out.println("Table created");
	   }

}
