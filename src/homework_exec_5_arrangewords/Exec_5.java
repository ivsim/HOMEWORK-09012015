package homework_exec_5_arrangewords;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Exec_5 {

	public static void main(String[] args) {

//		Scanner input = new Scanner (System.in);
//		String text = input.nextLine();
//		input.close();
		
		HashSet<String> words = new HashSet<String>();
		
		
		String text = "Един чудноват човек, нито селянин, нито гражданин, дрипав, "
				+ "окъсан, идеше към Енювото кафене и самси Еню, седнал отпред кафенето "
				+ "на сянка, не можеше да го познае кой е. Посред лято в тая страшна жега, "
				+ "тоя човек беше навлякъл дълго зимно палто, като попско расо, на главата му "
				+ "беше нахлузено смачкано бомбе, а краката му бяха обути с цървули.";
		
		String textLowCase = text.toLowerCase();
		
		Scanner fromText = new Scanner(textLowCase);
		
		fromText.useDelimiter("[^А-Яа-я]+");
		
		while (fromText.hasNext()){
			String temp = fromText.next();
			words.add(temp);
		}
		
		fromText.close();
				
		String[] wordsToSort = words.toArray(new String[words.size()]);
		
		Arrays.sort(wordsToSort);
		
		for (String x: wordsToSort){
			System.out.println(x);
		}

		
		
	}

}
