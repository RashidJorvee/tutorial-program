package wrappers;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxing {
	public static void main(String[] args) {
		int roll = 1234; 
		List<Integer> list = new ArrayList<Integer>();
		list.add(roll);
		list.add(Integer.valueOf(roll));
		System.out.println(list.get(1) instanceof Integer);
	}
}
