package loops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {
//		for(int i=1; i<=5; i++) {
//			System.out.println("Value of i "+i);
//			for(int j=1; j<=i; j++) {
//				System.out.println("value of j is " +j);
//			}
//		}
		Integer numberOfTimes[] = {1,2,3,4,5};
		for(int temp : numberOfTimes) {
			System.out.println(temp);
		}
		Integer arrayValue[] = {1,2,3,4,5};
		List<Integer> list = new ArrayList<>(Arrays.asList(arrayValue));
		list.forEach(listItem-> {
		     System.out.println(listItem); 
		});
	}

}
