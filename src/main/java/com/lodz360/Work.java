package com.lodz360;
import spark.Spark;



public class Work{
	public static void main(String[]args){
	    System.out.println("Hello Maven");
	
        Spark.get("/", (req, res) ->  {
            return "Hello cruel developer world, full of zasadzkas and kopas w dupas";
        });


    }
}
