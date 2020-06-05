package learnCollectionsAndStream.stream.collection.list.spliterator;

// Java program to demonstrate working of ListIterator 
import java.util.*;

class SpliteratorDemo1 {
	public static void main(String args[]) {

		// create an ArrayList which contains
		// emails for a group of people
		ArrayList<String> list = new ArrayList<String>();

		// Add emails to list
		list.add("abc@geeksforgeeks.org");
		list.add("user@geeksforgeeks.org");
		list.add("pqr@geeksforgeeks.org");
		list.add("random@geeksforgeeks.org");
		list.add("randomuser@geeksforgeeks.org");

		// create Spliterator of ArrayList
		// using spliterator() method
		Spliterator<String> emails = list.spliterator();

		// print result from Spliterator
		System.out.println("list of Emails:");

		// forEachRemaining method of Spliterator
		emails.forEachRemaining((n) -> System.out.println(n));
	}
}
