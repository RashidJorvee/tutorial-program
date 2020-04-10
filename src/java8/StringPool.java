package java8;

public class StringPool {
	void validateString(String arg1, String arg2) {
		if(arg1 == arg2) {
			System.out.println("Both "+arg1 +" and "+arg2 +" are identical.");
		}
		else {
			System.out.print("Both "+arg1 +" and "+arg2 +" are not identical. ");
			if(arg1.equals(arg2)) {
				System.out.print("Although content of both "+arg1 +" and "+arg2 +" are identical.");
			}
		}
	}

	public static void main(String[] args) {
		String name = "rashid";
		String name2 = "rashid";
		String name3 = new String("rashid");
		System.out.print("Address for both name and name2 are same? ");
		System.out.print(name==name2);
		System.out.print(", and value for both variables is? "+name.equals(name2));
		System.out.println();
		System.out.print("Address for both name2 and name3 are same? ");
		System.out.print(name2==name3); 
		System.out.print(", and value for both variables is? "+name2.equals(name3));
		System.out.println();
		System.out.print("Address for both name3 and name are same? ");
		System.out.print(name3==name);
		System.out.print(", and value for both variables is? "+name3.equals(name));
		StringPool stringPool = new StringPool();
		System.out.println();
		stringPool.validateString(name, name2);
		stringPool.validateString(name3, name2);
	}
}
