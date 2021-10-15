package com.day15;

import java.util.Hashtable;

public class Hashtable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Hashtable<Integer,String>map=new Hashtable<Integer,String>();
          map.put(120,"basha");
  		  map.put(124,"mashud");
  		  map.put(128,"salman");
  		  map.put(129,"shaik");
  		  System.out.println("Initial map:"+map);
  		 String returned_value = (String)map.remove(129);
  		 System.out.println("returned value is :"+returned_value);
  		 System.out.println("new map is:"+map);
  		  
	}

}
