package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo{
	/**
	 * @param ags
	 */
	public static void main(String[] ags) {
		
		//hold duplicate element
		
		//ArrayList implement list
		//work index bases
		//access fast
		//new class
		//not thread safe
		//50% size increase
		//less space
		//null support
		ArrayList<Integer> rolls=new ArrayList<Integer>();
		
		
		//add
		rolls.add(1);
		rolls.add(1, 2);
		rolls.add(3);
		rolls.add(null);
		System.out.println(rolls.size());
		System.out.println(rolls);
			
		//get object from index basis
		//System.out.println(rolls.get(0));
	
		//set
		//for update
		//rolls.set(0, 3);
		//System.out.println(rolls);
		
		//find
		//System.out.println(rolls.contains(3));
		
		//Iterator
		
					//forward direction
					
						//1.		
						//		Iterator<Integer>r=rolls.iterator();
						//		while (r.hasNext()) {
						//			System.out.println(r.next());
						//		}
					
						//2.
						//for(int i=0;i<rolls.size();i++) {
						//	System.out.println(rolls.get(i));
						//}
				
						//3.
						//for (Integer i : rolls) {
						//	System.out.println(i);
						//}
				
					//backward direction
					
						//1.
						//ListIterator<Integer>l=rolls.listIterator(rolls.size());
						//while (l.hasPrevious()) {j
						//	System.out.println(l.previous());
						//}
					
						//2.
						//for(int i=rolls.size()-1;i>=0;i--) {
						//	System.out.println(rolls.get(i));
						//}
				
					//if we want in array form
					//Object []object= rolls.toArray();
						//	for(Object o:object) {
							//	System.out.println((Integer)o);
							//}
					
					//using lamda
					//rolls.stream().forEach((x)->System.out.println(x));
		
		//filter
			//System.out.println(rolls.stream().filter(x->x==2).findAny().get());
		
		//remove
		//index basis
		//System.out.println(rolls.remove(2));
		//element basis
		//System.out.println(rolls.remove((Integer)2));
		
		//rolls.clear();
		//System.out.println(rolls);
		
		//ArrayList<Integer> rolls1=new ArrayList<Integer>();
		//rolls1.add(4);
		//rolls1.add(5);
		//rolls1.add(6);
		
		//rolls1.addAll(rolls);
		//rolls1.addAll(0, rolls);
		//System.out.println(rolls1);
		
		//ArrayList<Integer> rolls2=new ArrayList<Integer>();
		//rolls2.addAll(rolls);
		//rolls2.addAll(rolls1);
		//System.out.println(rolls2);
		//[1, 2, 3, 4, 5, 6]
		
		//rolls2.removeAll(rolls);
		
		
		//System.out.println(rolls2);
		//[4, 5, 6]
		//rolls2.retainAll(rolls);
		//System.out.println(rolls2);
		//[1, 2, 3]
				
	}
}