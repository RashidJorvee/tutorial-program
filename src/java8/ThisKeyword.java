package java8;

public class ThisKeyword {
	int num = 5;
	public String validate(Object ob) {
		if(this == ob) {
			return "identical";
		}
		else {
			return " not identical";
		}
	}
	public static void main(String[] args) {
		

	}

}
