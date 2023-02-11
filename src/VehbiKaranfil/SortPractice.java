package VehbiKaranfil;

import java.util.*;

public class SortPractice {

	
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(10);
		numbers.add(1);
		numbers.add(8);
		numbers.add(23);
		numbers.add(-4);
		
		ArrayList<String> words = new ArrayList<>();
		words.add("java");
		words.add("selenium");
		words.add("git");
		words.add("pyton");
		
		System.out.println(words);
	//	System.out.println(numbers);

		
		ArrayList<Person> people = new ArrayList<>();
		Person p1= new Person("Jeff" , 50, 701);
		Person p2= new Person("Mark" , 37, 702);
		Person p3= new Person("Warren" , 85, 703);
		
		people.add(p1);
		people.add(p2);
		people.add(p3);
		
		System.out.println(people);
		Collections.sort(people, Comparator.comparing(p -> p.age));
		System.out.println(people);
		
		for (int num: numbers) {
			
	//.out.println(num);
		}
		Collections.sort(words);
	//	System.out.println(words);
	//	Collections.sort(numbers);
	//	System.out.println(numbers);
		
	}
}
