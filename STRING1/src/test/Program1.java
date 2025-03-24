package test;

public class Program1 {

	public static void main(String[] args) {

		String str = "Programming";
		
		for(  int i = 0; i < str.length(); i++ ) {
				char ch = str.charAt(i);
				boolean flag = false;
				int count = 1;
				
			
				
			for( int j = 0; j < str.length(); j++ ) {
				
				if( i != j && ch == str.charAt(j) ) {
					flag = true;
					count++;
				}
			}
			if(flag ) {
				System.out.println(ch+","+count);
			}
		}
	}

}
