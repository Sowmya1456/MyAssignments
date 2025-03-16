package week3.day1;

public class PalindromeNumber {

	public static void  main(String[] args) {
		int output=0, rem=0, temp=0;
		int input=121;
		
		temp=input;
		
		for(int i=input; i>0; i=i/10) {
			rem=i%10;
			output=(output*10)+rem;
			
			}
		
		if(temp==output) {
			System.out.println("Given number is Palindrome:"+temp);
		}
		else {
			System.out.println("Given number is not Palindrome:"+temp);
		}
		
		}	
		
	}  


