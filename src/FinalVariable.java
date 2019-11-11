
public class FinalVariable {
	final int AGE = 5;
	
	public void AccessVariable() {
		System.out.println(AGE);	
		AGE=13;
	}
	public static void main(String[] args) {
		FinalVariable finalVariable = new FinalVariable();
		finalVariable.AccessVariable();
	}
}
