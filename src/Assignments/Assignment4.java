package Assignments;

import java.util.Scanner;

public class Assignment4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount: ");
		float amount = sc.nextFloat();
		System.out.println("Enter Rate: ");
		float rate = sc.nextFloat();
		System.out.println("Enter time: ");
		float time = sc.nextFloat();
		float si = (amount * time * rate)/100;
		System.out.println("Simple Interest is "+si);
	}
}
