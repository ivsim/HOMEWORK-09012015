package homework_exec_2_words;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Set;

public class Exec_2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		String[] enterWords = new String[20];	
		HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
		
		for (int i = 0; i < 20; i++){
			System.out.print("word " + (i+1) + " : ");
			enterWords[i] = input.next();
		}
		
		input.close();
		
		for (String x: enterWords){
			Integer count = wordCount.get(x);
			if (count == null){
				count = 0;
			}
			wordCount.put(x, count + 1);			
		}
		
//		System.out.println(wordCount);
		
		Set<String> wordKeys = wordCount.keySet();
		
		for (String x: wordKeys){
			int count = wordCount.get(x);
			System.out.printf("%s -> %d%n", x, count);
		}
		
	}

}
