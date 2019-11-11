
public class ParameterVariable {
	void MethodOne(String userName) {
		System.out.println(userName);
	}
	public static void main(String[] args) {
		ParameterVariable pv = new ParameterVariable();
		pv.MethodOne("Mr. X");

	}
}
