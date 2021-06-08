package com.LambdaExpression.Supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

//Supplier return only no i/p
public class SupplierDemo{

	/*
	 * @Override public String get() { // TODO Auto-generated method stub return
	 * "hello ayush"; }
	 */
	
	public static void main(String[] args) {
		//Supplier<String> sup=()->"hello Ayush";
		
		//System.out.println(sup.get());
		
		List<String> list=Arrays.asList("qq","kaka");
		
		List<String> list1=Arrays.asList();
		
		System.out.println(list.stream().findAny().orElseGet(()->"hello Ayush"));
	}

}
