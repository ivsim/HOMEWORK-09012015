package homework_exec_4_cards;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Set;

public class Exec_4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		HashMap<String, Integer> cards = new HashMap<String, Integer>();
				
		for (int i = 1; i<=5; i++){
			System.out.printf("Card %d: ", i);
			String temp = input.nextLine();
			Integer count = cards.get(temp);
			if (count == null){
				count = 0;
			}
			cards.put(temp, count + 1);
		}
		
		input.close();

		Set<String> cardKeys = cards.keySet();
		
		for (String x: cardKeys){
			if (cards.get(x) == 2) {System.out.print("\nЧИФТ");}
			if (cards.get(x) == 3) {System.out.print("\nСЕТ");}
			if (cards.get(x) == 4) {System.out.print("\nКАРЕ");}
		}		
		
	}

}
