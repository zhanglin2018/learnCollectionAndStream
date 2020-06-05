package learnCollectionsAndStream.stream.collection.list.retain;

// Java program to demonstrate working of ListIterator 
import java.util.*;

class RetainAllDemo4 {
	public static void main(String args[]) {
		// Creating an empty array list
		ArrayList<Integer> list1 = null;

		/// Creating another empty array list
		ArrayList<String> list2 = new ArrayList<String>();

		// Add values in the list2 list.
		list2.add("pen");
		list2.add("paper");
		list2.add("books");
		list2.add("rubber");

		// Before Applying method print both lists
		System.out.println("list1 Contains :" + list1);
		System.out.println("list2 Contains :" + list2);

		// Apply retainAll() method to list2 passing list1 as parameter
		list2.retainAll(list1);

		// Displaying both the lists after operation
		System.out.println("\nAfter Applying retainAll()" + " method to list2\n");
		System.out.println("list1 Contains :" + list1);
		System.out.println("list2 Contains :" + list2);
	}
}
