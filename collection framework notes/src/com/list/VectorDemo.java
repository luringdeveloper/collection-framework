package com.list;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
public static void main(String[] args) {
	
	//old class
	//increase size by 100%
	//thread safe
	//support null
	//it has a capacity method and default capacity is 10.
	Vector<Integer> vector=new Vector<Integer>();
	
	//list method of add
	vector.add(1);
	
	//vector method of add
	vector.addElement(2);
	vector.addElement(3);
	vector.addElement(4);
	vector.addElement(5);
	vector.addElement(6);
	
	Iterator<Integer> ee=vector.iterator();
	while (ee.hasNext()){ 
		System.out.println(ee.next());
		
	}
	
	vector.stream().forEach(x->System.out.println(x));
	
	Enumeration<Integer> e=vector.elements();
	while (e.hasMoreElements()) {
		System.out.println(e.nextElement());
		
	
		
		
//		vector.clear();
//		vector.add(0, null);
//		vector.addAll(vector);
//		vector.addAll(0, vector);
//		vector.contains(vector);
//		vector.containsAll(vector);
//		vector.elementAt(0);
//		vector.firstElement();
//		vector.retainAll(vector);
//		etc.
	}
}
}
