package learnCollectionsAndStream.stream.collection.list.retain;

// Java program to demonstrate working of ListIterator 
import java.util.*;

class RetainAllDemo2 {
	public static void main(String args[]) {
		// Creating an empty array list
		ArrayList<String> bags = new ArrayList<String>();

		// Add values in the bags list.
		bags.add(new String("pen"));
		bags.add(new String("pencil"));
		bags.add(new String("paper"));

		// Creating another array list
		ArrayList<String> boxes = new ArrayList<String>();

		// Add values in the boxes list.
		boxes.add(new String("pen"));
		boxes.add(new String("pen"));
		boxes.add(new String("paper"));
		boxes.add(new String("paper"));
		boxes.add(new String("books"));
		boxes.add(new String("rubber"));

		// Before Applying method print both lists
		System.out.println("Bags Contains :" + bags);
		System.out.println("Boxes Contains :" + boxes);

		// Apply retainAll() method to boxes passing bags as parameter
		boxes.retainAll(bags);

		// Displaying both the lists after operation
		System.out.println("\nAfter Applying retainAll()" + " method to Boxes\n");
		System.out.println("Bags Contains :" + bags);
		System.out.println("Boxes Contains :" + boxes);
	}
}
