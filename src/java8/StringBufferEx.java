package java8;

public class StringBufferEx {

	public static void main(String[] args) {
		{
			String a="casa", b="amas";
			System.out.println("aadj:"+a.compareTo(b));
			StringBuffer sb = new StringBuffer();
			System.out.println(sb.capacity());
			sb.append("This is an ");
			sb.append("object of ");
			sb.append("StringBuffer");
			System.out.println(sb);
			sb.delete(0, 4);
			sb.insert(0, "That");
			System.out.println(sb);
			sb.reverse();
			System.out.println(sb);
			System.out.println(sb.capacity());
			StringBuffer sb2 = new StringBuffer();
			sb2.append("My name is ");
			sb2.insert(11, "Gerard");
			System.out.println(sb2);
			
		}
	}
}
