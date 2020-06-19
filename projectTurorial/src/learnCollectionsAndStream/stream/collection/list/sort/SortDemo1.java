package learnCollectionsAndStream.stream.collection.list.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SortDemo1 {
	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<>();
		
		Random random = new Random();
		for (int i = 0; i < 10; i++)
			ints.add(random.nextInt(1000));

		// natural sorting using Collections class
		Collections.sort(ints);
		System.out.println("Natural Sorting: " + ints);

		// My custom sorting, reverse order
//		ints.sort((o1, o2) -> {
//			return (o2 - o1);
//		});
		
		ints.sort((o1, o2) -> o2 - o1);
		System.out.println("Reverse Sorting: " + ints);
	}
}
