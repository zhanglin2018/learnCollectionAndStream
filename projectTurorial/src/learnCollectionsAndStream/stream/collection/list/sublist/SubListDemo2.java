package learnCollectionsAndStream.stream.collection.list.sublist;

// Java program to demonstrate working of ListIterator 
import java.util.*;

class SubListDemo2 {
	public static void main(String args[]) {
		try {

			// Creating object of ArrayList<Integer>
			ArrayList<String> arrlist = new ArrayList<String>();

			// Populating arrlist1
			arrlist.add("A");
			arrlist.add("B");
			arrlist.add("C");
			arrlist.add("D");
			arrlist.add("E");

			// print arrlist
			System.out.println("Original arrlist: " + arrlist);

			// getting the subList
			// using subList() method
			System.out.println("\nEnd index value is out of range");
			List<String> arrlist2 = arrlist.subList(2, 7);

			// print the subList
			System.out.println("Sublist of arrlist: " + arrlist2);
		}

		catch (IndexOutOfBoundsException e) {
			System.out.println("Exception thrown : " + e);
		}

		catch (IllegalArgumentException e) {
			System.out.println("Exception thrown : " + e);
		}

	}
}
