package learnCollectionsAndStream.stream.examples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

import sun.net.www.content.audio.x_aiff;

public class JavaStreams {
	public static void main(String[] args) throws IOException {
		test1();
		test2();
		test3();
		test4();
		test5();
		test6();
		test7();
		test8();
		test9();
		test10();
		test11();
		test12();
		test13();
		test14();
	}

	//14. reduction - summary statistics
	private static void test14() {
		IntSummaryStatistics summaryStatistics = IntStream.of(1, 2, 3, 4, 5).summaryStatistics();
		System.out.println(summaryStatistics);
	}

	//13. reduce - sum
	private static void test13() {
		double total = Stream.of(1.1, 2.2, 3.3).reduce(0.0, (a, b) -> a + b);
		System.out.println("total = " + total);
	}

	// 12. Stream rows from txt file, store fields in HashMap
	private static void test12() throws IOException {
		Stream<String> rows1 = Files.lines(Paths.get("test.txt"));
		Map<String, Integer> map = new HashMap<>();

		map = rows1.map(x -> x.split(",")).filter(x -> x.length == 3).filter(x -> Integer.parseInt(x[1]) > 15)
				.collect(Collectors.toMap(x -> x[0], x -> Integer.parseInt(x[1])));
		rows1.close();
		
		map.forEach((x, y) -> System.out.println(x + ": " + y ));
	}

	// 11. Stream rows from CSV file, parse data from rows
	private static void test11() throws IOException {
		Stream<String> rows1 = Files.lines(Paths.get("test.txt"));
		rows1.map(x -> x.split(",")).filter(x -> x.length == 3).filter(x -> Integer.parseInt(x[1]) > 15)
				.forEach(x -> System.out.println(x[0] + " " + x[1] + " " + x[2]));
		System.out.println();
	}

	// 10. Stream rows from CSV file and count
	private static void test10() throws IOException {
		Stream<String> rows1 = Files.lines(Paths.get("test.txt"));
		int rowCount = (int) rows1.map(x -> x.split(",")).filter(x -> x.length == 3).count();
		System.out.println(rowCount);
		rows1.close();

	}

	// 9. Stream rows from text file and save to List
	private static void test9() throws IOException {
		List<String> bands = Files.lines(Paths.get("test.txt")).filter(x -> x.contains("zhang"))
				.collect(Collectors.toList());
		bands.forEach(System.out::println);
	}

	// 8. Stream rows from text file, sort, filter, and print
	private static void test8() throws IOException {
		Stream<String> bands = Files.lines(Paths.get("test.txt"));
		bands.sorted().filter(x -> x.length() > 13).forEach(System.out::println);
		bands.close();
		System.out.println();
	}

	// 7. Stream from List, filter and print
	private static void test7() {
		List<String> names = Arrays.asList("zhanglin", "hanjiaojiao", "zhangwei");
		names.stream().map(String::toLowerCase).filter(x -> x.startsWith("z")).forEach(System.out::print);
		System.out.println();

	}

	// 6. average of squares of an int array
	private static void test6() {
		Arrays.stream(new int[] { 2, 4, 6, 8, 10 }).map(x -> x * x).average().ifPresent(System.out::print);
		System.out.println();
	}

	// 5. Stream from Array, sort, filter and print
	private static void test5() {
		String[] names = { "zhanglin", "hanjiaojiao", "zhangwei" };
		Arrays.stream(names).filter(x -> x.startsWith("z")).sorted().forEach(System.out::print);
		System.out.println();
	}

	// 4. Stream.of, sorted and findFirst
	private static void test4() {
		Stream.of("zhanglin", "hanjiaojiao", "zhangwei").sorted().findFirst().ifPresent(System.out::print);
		System.out.println();
	}

	// 3. Integer Stream with sum
	private static void test3() {
		System.out.print(IntStream.range(1, 5).sum());
		System.out.println();
	}

	// 2. Integer Stream with skip
	private static void test2() {
		IntStream.range(1, 10).skip(5).forEach(System.out::print);
		System.out.println();
	}

	// 1. Integer Stream with range and for each
	private static void test1() {
		IntStream.range(1, 10).forEach(System.out::print);
		System.out.println();
	}
}
