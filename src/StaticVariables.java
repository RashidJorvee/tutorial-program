
public class StaticVariables {
	public int score;
	static void assignValue() {
		score = 320;
		System.out.println("Current score is: " + score);
	}
	public static void main(String[] args) {
		assignValue();

	}
}
