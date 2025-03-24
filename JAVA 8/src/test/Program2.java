package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program2 {

	public static void main(String[] args) {
//		Takes a list of integers.
//		Filters out all the even numbers. 
//		Doubles the remaining odd numbers.
//		Sorts them in descending order.
//		Collects the results into a new list
		
		List<Integer> list = Arrays.asList(11,4,7,99,23,78,33,67);
		
		List<Integer> newList = list.stream()
			.filter(num -> num%2 == 0)
			.map( num -> num * 2 )
			.sorted( (a, b) -> b - a )
			.collect(Collectors.toList());
		
		System.out.println(newList);
	}
}
