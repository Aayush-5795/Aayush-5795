package com.LambdaExpression.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
// Consumer method
public class ConsumerDemo {

	/*
	 * @Override public void accept(Integer t) { System.out.println("Adding--="+t);
	 * }
	 */
	
	public static void main(String[] args) {
		Consumer<Integer> same = (t)-> System.out.println("Adding--="+t);
		same.accept(567);
		
		List<Integer> list= Arrays.asList(1,2,3,4,5,6,7);
		list.stream().forEach(t->System.out.println("Print Number="+t));
	}

}
