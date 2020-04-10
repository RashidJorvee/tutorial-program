package java8;

import java.util.Arrays;
import java.util.List;

public class SplitWords {

	public static void main(String[] args) {
		String word="Rahul shdi-was running that day\"";
		SplitMultipleWords(word);
		

	}

	private static void SplitMultipleWords(String word) {
		String validStr = "\\w.*";
		String str="";
		System.out.println(str.isEmpty());
		System.out.println(word.startsWith("r") && word.endsWith("g"));
		System.out.println(word.substring(18));
		System.out.println(word.substring(10, 17));
		try {
			if(word.contains("A")){
				System.out.println(word);
			}
			else if(word.startsWith("\"") && word.endsWith("\"")) {
				System.out.println("String with : "+word.substring(1, word.length()-1));
			}
//			else if (word.matches(validStr)) {
//				System.out.println("matched with string specified");
//			}
			else if(word.matches(validStr)) {
				String[] newwords = word.split("[&|+| |-]");
				for(int i=0;i<newwords.length;i++) {
					System.out.println(newwords[i]);
				}
				List<String> listW = Arrays.asList(newwords);
				System.out.println(listW);
			}
			else {
				System.out.println("nothing matched");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e);
		}
	}

}
