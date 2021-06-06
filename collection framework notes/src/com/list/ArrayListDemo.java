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
		ArrayList<Integer> rolls=new ArrayList<Integer>();
		
		//add
		rolls.add(1);
		rolls.add(1, 2);
		rolls.add(3);
		//System.out.println(rolls);
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
				//while (l.hasPrevious()) {
				//	System.out.println(l.previous());
				//}
			
				//2.
				//for(int i=rolls.size()-1;i>=0;i--) {
				//	System.out.println(rolls.get(i));
				//}
				
				
	}
}