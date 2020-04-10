package java8;

public class MethodExample {

	/**
	 * @param name
	 * @return
	 */
	private String WithReturnType(String name) {
		return name;
	}
	private void WithoutReturnType() {
		System.out.println("Method without return type.");
	}
	public static void main(String[] args) {
		MethodExample example = new MethodExample();
		String UserName = example.WithReturnType("ABC");
		System.out.println(UserName);
		example.WithoutReturnType();

	}
}
