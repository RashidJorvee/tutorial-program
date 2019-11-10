package java8;

public class StaticMem {
	static int countryCode;
	static void staticMethod() {
		countryCode = 23;
		final String name = "India";
		String lastName = "AA";
		System.out.println(lastName);
	}
	public static void main(int[] abc) {
		System.out.println("First main");
	}
	public static void main(String[] argstu6) {
		staticMethod();
		int[] ab = {1,2,3};
		main(ab);
	}	

}

//	int countryCode;
//	static {
//		countryCode = 91; //Cannot make a static reference to the non-static field countryCode
//		
//		static { // this is illegal, we cannot create nested static
//			System.out.println("Static block inside static");
//		}
//	}