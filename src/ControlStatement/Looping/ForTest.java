package ControlStatement.Looping;

public class ForTest {
	/*
	 * 1. For
	 * 2. While
	 * 3. do-while
	 * ============== for ==========
	 * syntax:
	 * 		for(initialization; condition; inc/dec){
	 *			//statements
	 *		}
	 */
	
	public static void main(String[] args) {
		int y = 0;
		int es = 0;
		int os = 0;
				
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				es = es + i;
			}
			else {
				os = os + i;
			}
			//System.out.println(i);
			y= y+i;
		}
		System.out.println("Sum of even no = " + es);
		System.out.println("Sum of odd no = "+os);
		System.out.println("Total = "+y);
	}
}
