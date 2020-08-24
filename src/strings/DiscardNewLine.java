package strings;

public class DiscardNewLine {

	public static void main(String[] args) {
		String a1 = "rasid has created this\r\n" + 
				"\r\n" + 
				"but it should \n" + 
				"be nor\r\n" + 
				"a valid test case\r\n" + 
				"";
		String b1= a1.replaceAll("[\r\n]", "");
		System.out.println(b1);
	}

}
