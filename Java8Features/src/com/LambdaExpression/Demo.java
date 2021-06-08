package com.LambdaExpression;

interface Add{
	//void add(int a,int b);
	int sub(int a,int b);
}

public class Demo {

	
	public static void main(String[] args) {
	 Add substract=(a,b) -> {
		 if(a<b) {
			 throw new RuntimeException("Hello");
		 }else {
			 return a-b;
		 }
	 };
	 System.out.println(substract.sub(10, 20));
	 
	}

}
