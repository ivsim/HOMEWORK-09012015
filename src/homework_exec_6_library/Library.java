package homework_exec_6_library;

import java.util.HashMap;
import java.util.Set;

public class Library {

	private String name;
	private String address;
	private HashMap<Book, Integer> bookCollection;//K - bookname, V - num copies...
	
	public Library(String name, String address){
		setLibName(name);
		setAddress(address);
		this.bookCollection = new HashMap<Book, Integer>();
	}
	
	public void setLibName(String name){
		this.name = name;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	
	public void addBookCopy(Book name, Integer numCopies){
		this.bookCollection.put(name, numCopies);
	}
	
	public void removeBookCopy (Book name, Integer countCopies){
		if (this.bookCollection.get(name) >= 1){this.bookCollection.put(name, this.bookCollection.get(name) - 1);}
		if (this.bookCollection.get(name) == 0){this.bookCollection.remove(name);}
	}
	

	public void numAvailableBooks(){
		Set<Book> keys = this.bookCollection.keySet();	
		int total = 0;
		for (Book x: keys){
			total = total + this.bookCollection.get(x);
		}
		
		System.out.printf("%nБрой налични заглавия: %d, брой налични копия %d.", keys.size(), total);
	}
	
	public void libraryReport(){
		
		Set<Book> keys = this.bookCollection.keySet();
		
		System.out.printf("библиотека: %s.......адрес: %s%n", this.name, this.address);
		
		System.out.println("\nНАЛИЧНИ КНИГИ:\n");
		
		for (Book x: keys){
			x.print();
			System.out.printf(" - копия %-2s бр.;%n", this.bookCollection.get(x));
		}
		
	}
		
}
