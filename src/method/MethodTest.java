package method;

public class MethodTest {
	public static void main(String[] args) {
		//sum();
		//area();
		//printTable(123);
		//int x = getSumof1to100();
		//System.out.println("Sum of 100 nums = "+x);
		int f = findSmallestValue(52,45);
		System.out.println("Smallest value: "+f);
	}
	// 1. no return type with no arguments
	static void sum() {
		int a = 500;
		int b = 600;
		int c = a+b;
		System.out.println("Total sum = "+c);
	}
	static void area() {
		int r = 20;
		float d = 22/7 * (r * r); 
		System.out.println("Area = "+d);
	}
	
	
	// 2. no return type with arguments
	static void printTable(int n) {
		for(int i = 1; i<=10; i++) {
			System.out.println(n+" x "+i+" = "+(n*i));
		}
	}
	
	//3. return type with no arguments
	static int getSumof1to100() {
		int s = 0;
		for(int i=1; i<=100; i++) {
			s = s+i;
		}
		return s;
	}
	
	//4. return type with arguments 
	static int findSmallestValue(int x, int y) {
		if(x<y) {
			return x;
		}
		else {
			return y;
		}
	}
	
}
