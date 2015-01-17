package homework_exec_6_library;

public class Book {

	private String name;
	private String author;
	private int numPages;
	
	public Book(String name, String author, int numPages){
		this.name = name;
		this.author = author;
		this.numPages = numPages;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getAuthor(){
		return this.author;
	}
	
	public int getNumPages(){
		return this.numPages;
	}
	
	public void print(){
		System.out.printf("|автор: %-12s|заглавие: %-20s|страници: %-4s|", this.author, this.name, this.numPages );
	}
	
}
