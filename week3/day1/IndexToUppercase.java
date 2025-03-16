package week3.day1;

public class IndexToUppercase {

	public static void main(String[] args) {
		String test="changeme";
		
		char[] charArray = test.toCharArray();
		for (int i = 1; i < charArray.length; i++) {
			if(i%2!=0) {
				charArray[i]=Character.toUpperCase(charArray[i]);
			}
		}
		System.out.println("Converted String="+new String(charArray));
	}
}