package learnCollectionsAndStream.stream.collection.list.spliterator;

// Java program to demonstrate working of ListIterator 
import java.util.*;
import java.util.stream.Stream;

class SpliteratorDemo4 {
	public static void main(String args[]) {

		// Create an array list for doubles.
		ArrayList<Integer> al1 = new ArrayList<>();

		// Add values to the array list.
		al1.add(1);
		al1.add(2);
		al1.add(-3);
		al1.add(-4);
		al1.add(5);

		// Use tryAdvance() to display(action) contents of arraylist.

		System.out.print("Contents of arraylist:\n");

		// getting Spliterator object on al1
		Spliterator<Integer> splitr = al1.spliterator();

		// Use tryAdvance() to display(action) contents of arraylist.
		// Notice how lambda expression is used to implement accept method
		// of Consumer interface

		while (splitr.tryAdvance((n) -> System.out.println(n)))
			;

		// Use tryAdvance() for getting absolute values(action) of contents of
		// arraylist.

		// Create new list that contains absolute values.
		ArrayList<Integer> al2 = new ArrayList<>();

		splitr = al1.spliterator();

		// Here our action is to get absolute values
		// Notice how lambda expression is used to implement accept method
		// of Consumer interface
		while (splitr.tryAdvance((n) -> al2.add(Math.abs(n))))
			;

		System.out.print("Absolute values of contents of arraylist:\n");

		// getting Spliterator object on al2
		splitr = al2.spliterator();

		while (splitr.tryAdvance((n) -> System.out.println(n)))
			;

	}
}
