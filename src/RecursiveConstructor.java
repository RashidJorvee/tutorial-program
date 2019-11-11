
public class RecursiveConstructor {
	RecursiveConstructor() {
		this(2);
	}
	RecursiveConstructor(int a) {
		this();
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
