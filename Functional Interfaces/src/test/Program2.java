package test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Program2 {

	public static void main(String[] args) {
		
		Consumer<Integer> c = num -> System.out.println(num);
		
		
		List<Integer> list = Arrays.asList(1,4,6,9,3,6);
		
		c.accept(10);
	}

}
