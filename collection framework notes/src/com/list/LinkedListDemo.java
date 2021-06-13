package com.list;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
public static void main(String[] args) {
	LinkedList<String> names =new LinkedList<String>();
	//support null
	//insertion and deletion is fast
	
//Insertion Method	
	
	//add is list method
	names.add("b");
	
	//deque method
	names.addFirst("a");
	names.addLast("c");
	names.add(3, "d");
	
	//queue method
	
	names.offer("e");
	
	//Stack method
	names.push("f");
	
	
	//System.out.println("first list is: "+names);
	 
	LinkedList<String> ab= new LinkedList<>();
	  ab.add("G");
	  ab.add("H");
	  ab.add("I");
	  ab.add("J");
	  ab.add("K");
	  ab.add("A");
	  
	  names.addAll(ab);
	 
	  //System.out.println(names);
	 // [f, a, b, c, d, e, G, H, I, J, K, A]
	  
//remove method in list
	  
	  //names.remove("A");
	  //System.out.println(names);
	  // [f, a, b, c, d, e, G, H, I, J, K]
	  
	  //names.remove(10);
	  //System.out.println(names);
	  
	  //[f, a, b, c, d, e, G, H, I, J]
	  //names.remove();
	  //System.out.println(names);
	  //[a, b, c, d, e, G, H, I, J]
	  
	  //names.removeAll(ab);
	  //System.out.println(names);
	  //[a, b, c, d, e]
	
	  
	  System.out.println("collection is :"+names);
	 // collection is :[f, a, b, c, d, e, G, H, I, J, K, A]

// remove method of deque
	  names.removeFirst();
	  System.out.println(names);
	  //[a, b, c, d, e, G, H, I, J, K, A]
	
	  names.removeLast();
	  System.out.println(names);
	  //[a, b, c, d, e, G, H, I, J, K]
	  
	  names.removeFirstOccurrence("a");
	  System.out.println(names);
	  //[b, c, d, e, G, H, I, J, K]
	  
	  names.removeLastOccurrence("K");
	  System.out.println(names);
	  //[b, c, d, e, G, H, I, J]
	  
	  names.pollFirst(); 
	  System.out.println(names);
	  
	  //[c, d, e, G, H, I, J]
	 
	  names.pollLast(); 
	  System.out.println(names);
	  //[c, d, e, G, H, I]
	  
 // Queue method
	  names.poll();
	  System.out.println(names);
	  //[d, e, G, H, I]
	
//stack method	  
	  	  names.pop();
	  	  System.out.println(names);
	  	  //[e, G, H, I]

	  	  
	  	  
//get methods
	  	 
	  	 System.out.println(names);
	  	 //[e, G, H, I]
	  	
	  	 //list methods
	  	 
	  	 System.out.println( names.get(0));
	  	 //e
	  	 
	  	 //Deque method 
	  	  
	  	 System.out.println(names.getFirst());
	  	 //e
	  	 
	  	 System.out.println(names.getLast());
	  	 //I
	  	 
	  	 //queue method
	  	 System.out.println(names.element());
	  	 //e
	  	 System.out.println(names.peek());
	 	 //e
	  	 System.out.println(names.peekFirst());
	  	//e
	  	 System.out.println(names.peekLast());
	    //I	 
	  	 
	  	 
//Find method	  	 
	  	 System.out.println(names.contains("I")); 
	  	 System.out.println(names.containsAll(ab));

	  System.out.println(names);
	  //[e, G, H, I]
//iterator 
	  
	  //forward
	  	 names.stream().forEach(x->{System.out.println(x);});
	  	//e
	  	//G
	  	//H
	  	//I
	  
	  names.iterator().forEachRemaining(x->{if(x=="I") {
		  System.out.println("yes");
	  }else {
		System.out.println("no");
	}});
	  //no
	  //no
	  //no
	  //yes
	  
	  names.descendingIterator().forEachRemaining(x->System.out.println(x));
	  //I
	  //H
	  //G
	  //e
	  	 
}
}
