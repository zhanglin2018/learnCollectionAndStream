package learnCollectionsAndStream.stream.collection.list.foreach;

// Java program to demonstrate working of ListIterator 
import java. util.* ; 

class ForEachDemo 
{ 
	public static void main(String args[]) 
	{ 
		List<String> dayNames = new ArrayList(); 
		dayNames.add("Sunday"); 
		dayNames.add("Monday"); 
		dayNames.add("Tuesday"); 
		dayNames.add("Wednesday"); 
		dayNames.add("Thursday"); 
		dayNames.add("Friday"); 
		dayNames.add("Saturday"); 
		
		dayNames.forEach((str) -> System.out.println(str));
	}
} 

