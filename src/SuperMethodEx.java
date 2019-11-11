
public class SuperMethodEx extends SuperClass {
	public SuperMethodEx() {
		super();
		super("Jorvee");
	}

	public static void main(String[] args) {
		SuperMethodEx superMethodEx = new SuperMethodEx();

	}
}

class SuperClass {
	SuperClass(){
		System.out.println("rashid");
	}
	private SuperClass(String name) {
		System.out.println("This constructor received name argument " + name);
	}
}