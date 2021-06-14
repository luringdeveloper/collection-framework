package com.set;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetDemo {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Tree Set class Maintain Ascending order.
		//null not support
		//It support tree Structure
		
		TreeSet<String>tree =new TreeSet<String>();
		tree.add("b");
		tree.add("c");
		tree.add("d");
		//System.out.println(tree);
		//[b, c, d]
		
		TreeSet<String>tree1 =new TreeSet<String>();
		tree1.add("a");
		tree1.add("e");
		tree1.add("g");
		
		tree.addAll(tree1);
		//System.out.println(tree);
		//[a, b, c, d, e, g]
		
		
		//return element if found..if not return next element
		//System.out.println(tree.ceiling("f"));
		//g
		
		//return element if found..if not return previous element
		//System.out.println(tree.floor("f"));
		//e
		
		//return next element..if next element not having then giving null
		//System.out.println(tree.higher("a"));
		//b
		
		//return previous element..if previous element not having then giving null
		//System.out.println(tree.lower("a"));
		//null
		
		
		//return all next element including "c"
		//System.out.println(tree.tailSet("c"));
		//[c, d, e, g]
		
		//return all next element excluding "c"
		//System.out.println(tree.tailSet("c", false));
		//[d, e, g]
		
		//return all previous element excluding "c"
		//System.out.println(tree.headSet("c"));
		//[a, b]
		
		//return all previous element including "c"
		//System.out.println(tree.headSet("c", true));
		//[a, b, c]
		
		//return first element
		//System.out.println(tree.first());
		//a
		
		//return Last element
		//System.out.println(tree.last());
		//g
		
		//return first element 
		//System.out.println(tree.pollFirst());
		//a
		
		//return last element
		//System.out.println(tree.pollLast());
		//g
		
		//tree.isEmpty();
		//tree.clear();
		
		
		//how to print descending order
//		NavigableSet<String>navigableSet= tree.descendingSet();
//		
//		Iterator<String>iterator= navigableSet.iterator();
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//			
//		}
		
//		g
//		e
//		d
//		c
//		b
//		a

	}

}
