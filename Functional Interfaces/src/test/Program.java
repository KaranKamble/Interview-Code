package test;

import java.util.function.Predicate;

public class Program {
	//	Predicate
	public static void main(String[] args) {
		Predicate<Integer> p1 = ( num ) -> num%2 == 0 && num > 10;
		
		System.out.println(p1.test(12));
	}

	public static void main1(String[] args) {
		
		Predicate<Integer> p1 = ( num ) -> num%2 == 0;
		
		System.out.println(p1.test(12));

	}

}
