package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range=8;
		int firstNumber=0, secondNumber=1, nextNumber;
		
		for (int i = 1; i <=range; i++) {
			System.out.println(firstNumber+"");
			nextNumber=firstNumber+secondNumber;
			firstNumber=secondNumber;
			secondNumber=nextNumber;			
		}
	}
}
