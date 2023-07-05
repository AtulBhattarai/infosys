package ControlStatement.Looping;

import java.util.Scanner;

public class DoWhileTest {
	/*
	 * syntax:
	 * 		do{
	 * 			//statements
	 * 		} while(condition);
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for multiplication: ");
		int i = sc.nextInt();
		int j = 0;
		do {
			j++;
			System.out.println(i+" x "+j+" = "+i*j);
			
		} while(j<10);
	}
}
