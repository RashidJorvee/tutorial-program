package enums;

import java.util.LinkedHashMap;

public class TestPrint {

	public static void main(String[] args) {
		int a=5;
		String b="rashid";
		System.out.printf("your id is %d and your name is %s.", a, b);
		LinkedHashMap< String, String> lhm = new LinkedHashMap<String, String>();
		lhm.put("3",	"value");
		lhm.put("1",	"value1");
		lhm.put("2",	"value2");
		System.out.println(lhm); 
	}
}
