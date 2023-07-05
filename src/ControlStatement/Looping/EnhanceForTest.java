package ControlStatement.Looping;

public class EnhanceForTest {
	/*
	 * ============= Enhance For Loop/ForEach ==================
	 * #use to read data from collection(array,list,map,set etc)
	 * syntax :
	 * 		for(data_type var: collection){
	 * 			//statements
	 * 		}
	 */
	public static void main(String[] args) {
		int[] values = {5,5,6,5,4,6,4,6,4,6};
		String[] value = {"mdfj", "sjnfjd", "dbfjd"};
		int y = 0;
		for (int x : values) {
			System.out.println(x);
			y = x+ y;
		}
		System.out.println("Total " +y);
		for (String s: value) {
			System.out.println(s);
		}
	}
}
