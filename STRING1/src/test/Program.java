package test;

public class Program {

	public static void main(String[] args) {
		String string = "Software Services";
		String str = string.toLowerCase();
		for( int i = str.length()-1; i >= 0; i-- ) {
			
			char ch = str.charAt(i);
			boolean flag = false;
			
			for( int j = 0; j < str.length(); j++ ) {
				char ch1 = str.charAt(j);
				if( i != j && ch == ch1 ) {
					flag = true;
					break;	
				}
			}
			
			if( !flag ) {
				System.out.println(ch);
				return;
			}
		}
	}
	
	
	public static void main2(String[] args) {
		String str = "Software Services";
		
		for( int i = 0; i < str.length(); i++ ) {
			char ch = str.charAt(i);
			boolean flag = false;
			for( int j = 0; j < str.length(); j++ ) {
				
				if( i != j && ch == str.charAt(j) ) {
					flag = true;
					break;
				}
			}
			if( !flag ) {
				System.out.println(ch);
				return;
			}
		}
		
	}
	
	public static void main1(String[] args) {

		String str = "Nacre";
		String rev = "";

		int end = str.length() - 1;

		for (int i = end; i >= 0; i--) {

			char ch = str.charAt(i);
			rev = rev + ch;
		}

		System.out.println(rev);
	}
}
