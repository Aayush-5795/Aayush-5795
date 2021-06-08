package com.LambdaExpression.SortingExample;

import java.util.Comparator;
import java.util.List;

import com.LambdaExpression.streamApi.example.Database;
import com.LambdaExpression.streamApi.example.User;

public class SortingExample {
	
	public static void main(String[] args) {
		
	List<User> list=new Database().getAllUsers();
	
	//list.stream().sorted(Comparator.comparing(User::getSalary)).forEach(System.out::println); //Ascending
	
	list.stream().sorted((o1,o2)-> o2.getSalary()-o1.getSalary()).forEach(System.out::println);//Descending
	
	list.stream().sorted(Comparator.comparing(User::getName)).forEach(System.out::println);
	
	}

}
