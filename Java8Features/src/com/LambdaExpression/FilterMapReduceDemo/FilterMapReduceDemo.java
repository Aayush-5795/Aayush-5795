package com.LambdaExpression.FilterMapReduceDemo;

import java.util.Arrays;
import java.util.List;

public class FilterMapReduceDemo {
	
	public static void main(String[] args) {
		
		
		List<Integer> list=Arrays.asList(2,4,5,6,8,10,9);
		
		List<String> words=Arrays.asList("Hibernate","spring","java","microservices");
		
		//By Using Map
		System.out.println(list.stream().mapToInt(i-> i).sum());
		
		//By Using Reduce for addition
		System.out.println(list.stream().reduce(0,(a,b)->a+b));
		
		//By Using Reduce for addition
		System.out.println(list.stream().reduce(Integer::sum).get());
		
		//By Using Reduce for multiplication
		System.out.println(list.stream().reduce(1,(a,b)->a*b));
		
		//By Using Reduce for Max Value
		System.out.println(list.stream().reduce(1,(a,b)-> a>b?a:b));
		
		//By Using Reduce for Max Value by method
		System.out.println(list.stream().reduce(Integer::max).get());
		
		//By Using Reduce for Max Word by method
		System.out.println(words.stream().reduce((word1,word2)->word1.length()>word2.length()?word1:word2).get());
		
		//By Using Reduce for Avg Value by method
		System.out.println(list.stream().mapToDouble(i->i).average().getAsDouble());
	}

}
