package method;

import java.util.Scanner;

public class Classwork {
	
	public static void main(String[] args) {
		int y = getArea(3,5);
		System.out.println("Area = "+y);
		int z = volume(4,5);
		System.out.println("Volume = "+z);
		int d = processing();
		System.out.println("Your Simple Interest is "+ d);		
	}
	static int getArea(int l, int b){
		int area = l * b;
		return area;
	}
	static int volume (int i, int j) {
		int vol = 2* (i+j);
		return vol;
	}
	static int input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter principle: ");
		int p = sc.nextInt();
		return p;
	}
	static int processing() {
		int a = input();
		int SI = (a * 2 * 40) / 100;
		return SI;
	}
//	static int output() {
//		int b = input();
//		System.out.println("Your Simple Interest is "+ b);
//		
//	}
}
	

