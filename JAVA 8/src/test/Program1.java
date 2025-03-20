package test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Student{
	private int rollNo;
	private String name;
	
	public Student() {
	}
	
	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}

}

public class Program1 {
	
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student(2, "Raghav"), 
				new Student(6, "Rama"),
				new Student(3, "Raghavi"),
				new Student(9, "Ram"));
		
		list.stream()
			.filter(student -> student.getRollNo() > 5)
			.forEach(System.out :: println);
	}
	
	
	public static void main7(String[] args) {
		List<Integer> list = Arrays.asList(11,22,33,44,55,66,77);
		
	Optional<Integer> thirdHighSal = 	list.stream()
			.sorted( (a,b) -> b - a)
			.skip(2)
			.findFirst();
	
		System.out.println(thirdHighSal.get());
	}
	
	
	public static void main6(String[] args) {
		List<Integer> list = Arrays.asList(11,22,33,44,55,66,77);
		
		list.stream()
			.sorted()
			.skip(2)
			.limit(list.size() - 4)
			.forEach(System.out :: println);
	}
	
	
	public static void main5(String[] args) {
		List<Integer> list = Arrays.asList(32,11,66,33,4,5,7,1);
		
		list.stream()
			.filter(num -> num %2 == 0 && num % 4 == 0 )
			.forEach(System.out :: println);
	}
	
	
	public static void main4(String[] args) {
		List<Integer> list = Arrays.asList(32,11,66,33,4,5,7,1);
		
		list.stream()
		//	.sorted()
			.skip(2)
			.limit(list.size() - 5)
			.forEach(System.out :: println);
	}
	
	
	public static void main3(String[] args) {
		List<Integer> list = Arrays.asList(32,11,66,33,4,5,7,1);
		
		long count = list.stream()
			.count();
		
		System.out.println(count);
	}
	
	
	public static void main2(String[] args) {
		List<Integer> list = Arrays.asList(32,11,66,33,4,5,7,1);
		
		list.stream()
			.filter(num -> num % 2 != 0 && num > 10)
			.sorted()
			.forEach(System.out :: println );
	}

	public static void main1(String[] args) {
		
		List<Integer> list = Arrays.asList(32,11,66,33,4,5,7,1);
		
		list.stream()
		.filter(num -> num % 2 == 0 && num > 10 )
		.forEach(num -> System.out.println(num));

	}

}
