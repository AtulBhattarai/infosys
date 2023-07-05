package Array;

import java.util.Scanner;

public class Classwork {
	public static void main(String[] args) {
//		int price[] = new int[10];
//		Scanner sc = new Scanner(System.in);
//		
//		for(int i=0; i<price.length; i++) {
//			System.out.println("Enter price of book: ");
//			price[i] = sc.nextInt();
//		}
//		int sum = 0;
//		float avg = 0;
//		for(int x: price) {
////			System.out.println(x);
//			sum = sum+x;
//		}
//		System.out.println(sum);
//		avg = sum / price.length;
//		System.out.println(avg);	
		String country[] = new String[5];
		Scanner s = new Scanner(System.in);
		for (int i=0; i<country.length; i++) {
			System.out.println("ENter name of the country: ");
			country[i] = s.next();
		}
		System.out.println("The list of given countries are ");
		for(String x: country) {
			System.out.println(x);
		}
	}
}
