package com.LambdaExpression.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//Predicate Used test method return boolean 
public class PredicateDemo {

	/*
	 * @Override public boolean test(Integer t) { if(t%2==0) { return true; }else {
	 * return false; } }
	 */
	
	public static void main(String[] args) {
		/*
		 * Predicate<Integer> intr = t -> t%2==0; System.out.println(intr.test(26));
		 */
		
		List<Integer> list= Arrays.asList(1,2,3,4,5,6,7);
		list.stream().filter(t -> t%2==0).forEach(t->System.out.println("Print Even No. ="+t));
		
	}

}
