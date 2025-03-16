package week3.day1;

public class FirstIntersection {

	public static void main(String[] args) {
		int num[]= {3,4,6,5,7};
		int num1[]={2,4,6,8,3};
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num1.length; j++) {
				if(num[i]==num1[j]) {
					System.out.println("Intersection is:"+num[i]);
				}
				
			}
		}
	}

}
