package typecasting;

public class LongToInt {

	public static void main(String[] args) {
		int intValue = 1234;
		double doubleValue = intValue;
		System.out.println(doubleValue);
		long longValue = 123456789l;
		intValue = (int) longValue;
		System.out.println(intValue);

	}
}
