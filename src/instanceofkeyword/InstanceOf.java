package instanceofkeyword;

import java.util.List;
import java.util.ArrayList;

public class InstanceOf {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Hello World");
		list.add(2);
		System.out.println(list.get(0) instanceof Object);
		System.out.println(list.get(1) instanceof Integer);
		
	}

}
