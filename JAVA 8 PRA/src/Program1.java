import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Program1 {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Yarah","Ram","Vicky","Ajay", "Vidya");
		
		list.stream()
			.filter(name -> name.startsWith("V"))
			.forEach(System.out :: println);
	}
	
	public static void main7(String[] args) {
		List<String> list = Arrays.asList("Yarah","ram","Vicky","Ajay");
		
			list.stream()
				.sorted((a, b) -> b.compareTo(a))
				.forEach(System.out :: println);

	}
	
	public static void main6(String[] args) {
		List<Integer> list = Arrays.asList(33, 22, 779, 999, 22, 3, 5, 6, 102, 666);

	Optional<Integer> first = 	list.stream()
			.skip(2)
			.findFirst();
	
	System.out.println(first.get());
	}
	
	public static void main5(String[] args) {
		List<Integer> list = Arrays.asList(33, 22, 779, 999, 22, 3, 5, 6, 102, 666);

		list.stream()
			.skip(2)
			.limit( list.size() - 3)
			.forEach(System.out :: println);
	}
	
	public static void main4(String[] args) {
		List<Integer> list = Arrays.asList(33, 22, 779, 999, 22, 3, 5, 6, 102, 666);

		list.stream()
			.sorted((a, b) -> b-a)
			.forEach(System.out :: println);
	}
	
	public static void main3(String[] args) {
		List<Integer> list = Arrays.asList(33, 22, 779, 999, 22, 3, 5, 6, 102, 666);

		list.stream()
			.sorted()
			.forEach( System.out :: println);
	}

	public static void main2(String[] args) {

		List<Integer> list = Arrays.asList(33, 22, 779, 999, 22, 3, 5, 6, 102, 666);
		
	long count  = 	list.stream()
			.count();
	
	System.out.println(count);

	}

	public static void main1(String[] args) {

		List<Integer> list = Arrays.asList(33, 22, 779, 999, 22, 3, 5, 6, 102, 666);

		list.stream().filter(num -> num > 50 && num % 2 == 0).forEach(System.out::println);
	}
}
