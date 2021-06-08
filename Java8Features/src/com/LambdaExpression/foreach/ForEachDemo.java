package com.LambdaExpression.foreach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ForEachDemo {
	
	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		list.add("aayush");
		list.add("piyu");
		list.add("vidi");
		list.add("prasad");
		
		list.stream().forEach(t->System.out.println(t));
		
		Map<Integer, String> list2=new HashMap<>();
		list2.put(3, "c");
		list2.put(4, "d");
		list2.put(5, "e");
		list2.put(1, "a");
		list2.put(2, "b");
		
		
		//list2.forEach((k,v)->System.out.println("Key="+k+" : Value="+v));
		
		//list2.entrySet().stream().forEach(obj->System.out.println(obj));
		
		//list2.entrySet().stream().filter(t->t.getKey()%2==0).forEach(obj->System.out.println(obj));
		
		//list2.entrySet().stream().sorted((o1,o2)->o1.getKey()-o2.getKey()).forEach(System.out::println);
		
		list2.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
	}

}
