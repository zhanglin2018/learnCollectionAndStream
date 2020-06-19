package learnCollectionsAndStream.stream.examples1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import learnCollectionsAndStream.stream.examples1.Person.Gender;

public class JavaStreams2 {
	public static void main(String[] args) {
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

	private static List<Person> generatePersons() {
		List<Person> persons = Arrays.asList(new Person("zhanglin", 28, Gender.MALE),
				new Person("zhangwei", 16, Gender.MALE), new Person("hanjiaojiao", 28, Gender.FEMALE),
				new Person("fuxihua", 52, Gender.FEMALE), new Person("zhangjinzhou", 52, Gender.MALE));
		return persons;
	}

	// test filter.
	private static void test2() {
		List<Person> persons = generatePersons();
		List<Person> malePersons = persons.stream().filter(person -> person.getGender().equals(Gender.MALE))
				.collect(Collectors.toList());
		List<Person> femalePersons = persons.stream().filter(person -> person.getGender().equals(Gender.FEMALE))
				.collect(Collectors.toList());
		persons.forEach(System.out::println);
		malePersons.forEach(System.out::println);
		femalePersons.forEach(System.out::println);
		System.out.println();
	}

	// test sort
	private static void test3() {
		List<Person> persons = generatePersons();
		List<Person> sortPersons = persons.stream().sorted(Comparator.comparing(Person::getName))
				.sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList());
		sortPersons.forEach(System.out::println);
		System.out.println();
	}

	// all match
	private static void test4() {
		List<Person> persons = generatePersons();
		boolean allMatchTrue = persons.stream().allMatch(person -> person.getAge() >= 16);
		System.out.println(allMatchTrue);

		boolean allMatchFalse = persons.stream().allMatch(person -> person.getAge() > 16);
		System.out.println(allMatchFalse);
	}

	// any match
	private static void test5() {
		List<Person> persons = generatePersons();
		boolean allMatchTrue = persons.stream().anyMatch(person -> person.getAge() >= 16);
		System.out.println(allMatchTrue);

		boolean allMatchFalse = persons.stream().anyMatch(person -> person.getAge() > 60);
		System.out.println(allMatchFalse);
	}

	// none match
	private static void test6() {
		List<Person> persons = generatePersons();
		boolean allMatchTrue = persons.stream().noneMatch(person -> person.getAge() >= 16);
		System.out.println(allMatchTrue);

		boolean allMatchFalse = persons.stream().noneMatch(person -> person.getAge() > 60);
		System.out.println(allMatchFalse);

	}

	// max
	private static void test7() {
		List<Person> persons = generatePersons();
		persons.stream().max(Comparator.comparing(Person::getAge)).ifPresent(System.out::println);

	}

	// min
	private static void test8() {
		List<Person> persons = generatePersons();
		persons.stream().min(Comparator.comparing(Person::getAge)).ifPresent(System.out::println);

	}

	// Group
	private static void test9() {
		List<Person> persons = generatePersons();
		Map<Gender, List<Person>> groupByGenderMap = persons.stream().collect(Collectors.groupingBy(Person::getGender));
		groupByGenderMap.forEach((x, y) -> System.out.println(x.toString() + " : " + y.toString()));
	}

	private static void test10() {

	}

	private static void test11() {

	}

	private static void test12() {

	}

	private static void test13() {

	}

	private static void test14() {

	}

}
