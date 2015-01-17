package homework_exec_1_array;

import java.util.Scanner;
import java.util.Arrays;

public class Exec_1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Please, enter array size: ");
		int arraySize = input.nextInt();
		
		int[] array = new int[arraySize];
		
		for (int i = 1; i <= arraySize; i++){
			System.out.print("array member " + i +" : ");
			array[i-1] = input.nextInt();
		}
		
		input.close();
		Arrays.sort(array);
		
		for (int x: array){
			System.out.print(x + " ");
		}
		
	}

}
