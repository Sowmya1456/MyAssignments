package week3.day1;

import java.util.Arrays;

public class FindMissingElements {

	public static void main(String[] args) {
		int input[]= {1,4,3,2,8,6,7};
		int output;
		
		Arrays.sort(input);
		
		for (int i = 1; i < input.length; i++) {
			if(input[i]-input[i-1]==1) {
				
			}else {
				System.out.println("Missng number is:"+(input[i-1+1]));
			}
		}
	} 

}