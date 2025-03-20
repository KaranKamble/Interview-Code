package test;

public class Program {

	public static void main1(String[] args) {
		// reverse of the String
		String str = "Nacre";
		String rev = "";

		int end = str.length() - 1;

		for (int i = end; i >= 0; i--) {
			char ch = str.charAt(i);
			rev = rev + ch;
		}

		System.out.println(str);
		System.out.println(rev);
	}

	public static void main2(String[] args) {
		// print First non-repeated character from given String
		String str = "Software Services";

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			boolean flag = false;

			for (int j = 0; j < str.length(); j++) {

				if (i != j && ch == str.charAt(j)) {
					flag = true;
					break;
				}

			}
			if (!flag) {
				System.out.printf("1st Non repeated char " + ch);
				return;
			}
		}

	}

	public static void main(String[] args) {
		// print last non-repeated character from given String
		

		String string = "Software Services";
		String str = string.toLowerCase();
		
		for( int i = str.length()-1; i >= 0; i-- ) {
			char ch = str.charAt(i);
			boolean flag = false;
			
			for( int j = 0; j < str.length(); j++ ) {
				
				if( i != j && ch == str.charAt(j)) {
					flag = true;
					break;
				}
			}
			
			if( !flag ) {
				System.out.println("last non-repeated character is : "+ch);
				return;
			}
		}
		

	}

	public static void main4(String[] args) {
		// remove the duplicate characters from the given String

		String str = "banaans";
		String norp = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (norp.indexOf(ch) == -1) {
				norp = norp + ch;
			}
		}

		System.out.println("String without duplicates: " + norp);
	}

	public static void main5(String[] args) {
		// count the number of occurrences of each character in a string

		String str = "apple";

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			int count = 1;

			for (int j = 0; j < str.length(); j++) {

				if (i != j && ch == str.charAt(j)) {
					count++;
				}
			}

			if (str.indexOf(ch) == i) {
				System.out.println(ch + ": " + count);
			}

		}
	}

	public static void main6(String[] args) {
		// program to print duplicate characters from the given String
		// Output: r, g, m
		String str = "Programming";

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			for (int j = 0; j < str.length(); j++) {

				if (i != j && ch == str.charAt(j)) {

					if (str.indexOf(ch) == i) {
						System.out.print(ch + ",");
					}
				}
			}
		}
	}

	public static void main7(String[] args) {
		// print all duplicate character and their count form the given String
		// Output: g: 2 r: 2 m: 2

		String str = "Programming";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int count = 1;

			if (str.indexOf(ch) != i) {
				continue; // Skip if the character has already been counted
			}

			for (int j = 0; j < str.length(); j++) {

				if (i != j && ch == str.charAt(j)) {
					count++;
				}
			}

			if (count > 1) {
				System.out.println(ch + ":" + count);
			}
		}

	}
	
	
	public static void main8(String[] args) {
		// program to print Highest occurred character from given String
		//	Output: a
		
		String str = "aaaaaaaabbcddddd";
		
		int maxCount = 1;
		char maxChar = '\0';
		
		for( int i = 0; i < str.length(); i++ ) {
			
			char ch = str.charAt(i);
			
			int count = 1;
			
			
			for( int j = 0; j < str.length(); j++ ) {
				
				if( i != j && ch == str.charAt(j)) {
					count++;
				}
			}
			
			if( count > maxCount ) {
				maxCount = count;
				maxChar = ch;
			}
		}
		
		System.out.println("Highest occurred character: " + maxChar);
		
	}

}
