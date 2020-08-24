package switchcase;

public class SwitchCase {

	public static void main(String[] args) {
		String color = "green";
		switch(color) {
		case "red":
			System.out.println("Color is red.");
			break;
		case "yellow":
			System.out.println("Color is yellow.");
			break;
		default:
			System.out.println("Not matched!");
		}

	}

}
