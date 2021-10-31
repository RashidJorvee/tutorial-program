package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElementsFromList {

	public static void main(String[] args) {
		List<Integer> duplicatesList = new ArrayList<>();
		RemoveDuplicateElementsFromList rd = new RemoveDuplicateElementsFromList();
		duplicatesList.add(0);
		duplicatesList.add(1);
		duplicatesList.add(5);
		duplicatesList.add(1);
		duplicatesList.add(0);
		duplicatesList.add(0);
		rd.removeDuplicate(duplicatesList);
	}
	public void removeDuplicate(List<Integer> duplicatesList) {
	    List<Integer> listWithoutDuplicates = duplicatesList.stream()
	     .distinct()
	     .collect(Collectors.toList());
	    System.out.println(listWithoutDuplicates);
	}
}
