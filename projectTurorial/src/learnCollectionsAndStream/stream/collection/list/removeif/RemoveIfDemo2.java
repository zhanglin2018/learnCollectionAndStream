package learnCollectionsAndStream.stream.collection.list.removeif;

// Java program to demonstrate working of ListIterator 
import java.util.*;

class RemoveIfDemo2 {
	public static void main(String args[]) {

		// create an ArrayList which going to
		// contains a list of Student names which is actually
		// string values
		ArrayList<String> students = new ArrayList<String>();

		// Add Strings to list
		// each string represents student name
		students.add("Ram");
		students.add("Mohan");
		students.add("Sohan");
		students.add("Rabi");
		students.add("Shabbir");

		// apply removeIf() method
		// we are going to remove names
		// start with S
		students.removeIf(n -> (n.charAt(0) == 'S'));

		System.out.println("Students name Does not start with S");
		// print list
		for (String str : students) {
			System.out.println(str);
		}
	}
}
