package com.LambdaExpression.streamApi.example;

import java.util.List;
import java.util.stream.Collectors;

public class Example {
	
	public static List<User> getTaxPayer(String tax){
		return (tax.equalsIgnoreCase("tax")) 
	     ? new Database().getAllUsers().stream().filter(user->user.getSalary()>500000).collect(Collectors.toList())
		 : new Database().getAllUsers().stream().filter(user->user.getSalary()<=500000).collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		System.out.println(getTaxPayer("tax"));
	}

}
