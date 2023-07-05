package Array;

import java.util.Arrays;

public class ArraySortTest {
	public static void main(String[] args) {
		int data[] = {42,45,75};
		Arrays.sort(data);
		System.out.println(Arrays.toString(data));
		
		System.out.println("======Reverse array========");
		for(int i=data.length-1; i>=0; i--) {
			System.out.print(data[i]+" ");
		}
	}
}
