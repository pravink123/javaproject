package com.velocity.demo;

import java.util.ArrayList;
import java.util.List;

public class Student {
 public static void main(String[] args) {
	
	 List<String> list=new ArrayList<String>();
	 list.add("Pravin");
	 list.add("Suraj");
	 list.add("Datta");
	  System.out.println("Master changes......");
	  System.out.println("Changes done by dev-2......");
		 System.out.println(list);
	 System.out.println("Pravin Changes.....done by dev1..");
	 System.out.println("for checking conflict.....");
}
}
