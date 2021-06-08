package com.LambdaExpression.streamApi.example;

import java.util.ArrayList;
import java.util.List;

public class Database {
	
	public List<User> getAllUsers(){
		List<User> list=new ArrayList<>();
		list.add(new User(1, "aayush", 300000));
		list.add(new User(2, "ashish", 600000));
		list.add(new User(3, "aakash", 700000));
		list.add(new User(4, "piyush", 900000));
		list.add(new User(5, "prsad", 100000));
		return list;
	}

}
