package javaProgram;

import java.util.List;

public class Book {
	private String title;
    private String author;

    public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
    // Constructors, getters, setters...
}

class BookResponse {
    private List<Book> books;

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

    // Constructors, getters, setters...
}
