package com.day15;
import java.util.*;

public class Hashtable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,String>map =new Hashtable<Integer,String>();
		map.put(120,"basha");
		map.put(124,"mashud");
		map.put(128,"salman");
		map.put(129,"shaik");
	System.out.println(map.getOrDefault(120,"not Found"));
	System.out.println(map.getOrDefault(128,"not Found"));
	System.out.println(map.getOrDefault(125,"not Found"));
	}
	

}
