package com.set;

import java.util.HashSet;
import java.util.Spliterator;

public class HashSetDemo {
	public static void main(String[] args) {
		//Order is not Fixed
		// Duplicate value not accepted 
		//Support null literal
		//It support hashing technique
		
		HashSet<String> h=new HashSet<String>();
		h.add("z");
		h.add("b");
		h.add("a");
		h.add(null);
		
		//System.out.println(h);
		
		
		Spliterator<String>a =h.spliterator();
		
		//a.forEachRemaining(x->System.out.println(x));
	//	a.forEachRemaining(System.out::println);
		
			Object []q =h.toArray();
			
		for(int i=0;i<q.length;i++) {
			System.out.println((String)q[i]);
		}
		
		for (Object object : q) {
			System.out.println(object);
		}
		
		
		
	}

}

