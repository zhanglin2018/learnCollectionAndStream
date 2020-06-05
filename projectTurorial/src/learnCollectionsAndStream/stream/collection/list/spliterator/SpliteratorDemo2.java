package learnCollectionsAndStream.stream.collection.list.spliterator;

// Java program to demonstrate working of ListIterator 
import java.util.*;

class SpliteratorDemo2 {
	public static void main(String args[]) {

		// create an ArrayList which contains
		// user details from user class
		ArrayList<user> list = new ArrayList<user>();

		// Add emails to list
		list.add(new user("Aman", 24));
		list.add(new user("Suraj", 23));
		list.add(new user("Amar", 24));
		list.add(new user("Kajal", 22));

		// create Spliterator of ArrayList
		// using spliterator() method
		Spliterator<user> users = list.spliterator();

		// print result from Spliterator
		System.out.println("list of Emails:");
		

		// forEachRemaining method of Spliterator
		users.forEachRemaining((n) -> System.out.println("User name : " + n.name + " and user age: " + n.age));
	}
}

// create a user class
class user {

	String name;
	int age;

	user(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
