package learnCollectionsAndStream.stream.collection.list.foreach;

// Java program to demonstrate working of ListIterator 
import java. util.* ; 

class EnumerationDemo 
{ 
	public static void main(String args[]) 
	{ 
		Vector dayNames = new Vector(); 
		dayNames.add("Sunday"); 
		dayNames.add("Monday"); 
		dayNames.add("Tuesday"); 
		dayNames.add("Wednesday"); 
		dayNames.add("Thursday"); 
		dayNames.add("Friday"); 
		dayNames.add("Saturday"); 

		// Creating enumeration 
		Enumeration days = dayNames.elements(); 

		// Retrieving elements of enumeration 
		while (days.hasMoreElements()) 
			System.out.println(days.nextElement()); 
	} 
} 

