package Assignments;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		float first = sc.nextFloat();
		System.out.println("Enter second number: ");
		float second = sc.nextFloat();
		float sum = first + second;
		float average = (first+second)/2;
		System.out.println("The sum of given numbers is "+sum);
		System.out.println("The average of given numbers is "+average);
	}
	
}
