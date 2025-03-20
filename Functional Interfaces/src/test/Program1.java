package test;

import java.util.function.Function;

public class Program1 {

	public static void main(String[] args) {
		
		Function<Integer, Integer> f1 = num -> num * 2;
		
		System.out.println(f1.apply(20));
	}

}
