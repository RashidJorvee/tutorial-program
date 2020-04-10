
public class ArraysEx {

	public static void main(String[] args) {
		int[] arrayName;
		int arrayName2[] = new int[5];
		
		System.out.println(arrayName2.length);
		//arrayName2 = new {1,1,1,3,5,6,7};
		//This line of code will throw indexoutofbound exception.
		//arrayName2[6] = 4;
		System.out.println(arrayName2.length);
		System.out.println(arrayName2);
		String ab="a,b,c";
		String[] arrr= ab.split(",");
		for(String s: arrr) {
			System.out.println(s);
		}
	}

}
