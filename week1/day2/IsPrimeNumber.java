package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int number=13;
		
		for (int i = 2; i < number-1; i++) {
			if(number%i==0){
				System.out.println("Given number is not prime number:"+number);
				break;
				
			}
			else {
				
				System.out.println("Given number is prime number:"+number);
				break;
			}
		}
	}
}
