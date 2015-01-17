package homework_exec_3_uniquewords;

import java.util.Scanner;
import java.util.ArrayList;

public class Exec_3 {

	public static void main(String[] args) {

//		Scanner input = new Scanner(System.in);
//		String text = input.nextLine();
//		input.close();
		
		ArrayList<String> words = new ArrayList<String>();
		
		String text = "Той е поет и вдъхновението му иде изведнъж: никога той не е тъй "
				+ "изобретателен, тъй забавен, никога не прилага тъй сполучливо своята "
				+ "прочута наука за цветята, както сега. ";
		
		String textLowCase = text.toLowerCase();// because equals differentiates between upper and lower case...
		
		Scanner fromText = new Scanner(textLowCase);
		
		fromText.useDelimiter("[^А-Яа-я]+");// found it on: https://www.youtube.com/watch?v=3RSXHVyzdmg
		
		while (fromText.hasNext()){
			String temp = fromText.next();
			words.add(temp);
		}
		
		fromText.close();
		
		System.out.println("unique words:\n");
		
		for (String x: words){
			int count = 0;
			for (String y: words){
				if (x.equals(y)){
					++ count;
				}
			}
			if (count > 1){continue;}
			System.out.println(x);			
		}
			
	}

}
