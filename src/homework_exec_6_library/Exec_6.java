package homework_exec_6_library;

//import java.util.Scanner;

public class Exec_6 {

	public static void main(String[] args) {

//		Scanner input = new Scanner(System.in);
//		System.out.println("Library name: ");
//		String name = input.nextLine();
//		System.out.println("Library address: ");
//		String address = input.nextLine();
//		
//		input.close();
		
		//let's create some books...
		Book book1 = new Book("Винету", "Карл Май", 125);
		Book book2 = new Book("Под игото", "Иван Вазов", 106);
		Book book3 = new Book("3-та мускетари", "Ал. Дюма", 356);
		Book book4 = new Book("Жел. светилник", "Д. Талев", 238);
		Book book5 = new Book("Тютюн", "Д. Димов", 456);
		Book book6 = new Book("Процесът", "Фр. Кафка", 98);
		Book book7 = new Book("Изворът", "Айн Ранд", 587);
		
		//let's create the library...
		
		Library Lib1 = new Library("Кирил и Методий", "1000 София, бул. \"Васил Левски\", N1");
		
		//lets's add and remove some books...
		
		Lib1.addBookCopy(book7, 23);
		Lib1.addBookCopy(book6, 5);
		Lib1.addBookCopy(book1, 3);
		Lib1.addBookCopy(book5, 2);
		Lib1.addBookCopy(book3, 12);
		Lib1.addBookCopy(book4, 2);
//		Lib1.libraryReport();
//		Lib1.numAvailableBooks();
		Lib1.removeBookCopy(book4, 1);
		Lib1.addBookCopy(book2, 1);
//		Lib1.libraryReport();
//		Lib1.numAvailableBooks();
		
		//let's make a report...
		
		Lib1.libraryReport();
		Lib1.numAvailableBooks();
		
		
		
	}

}
