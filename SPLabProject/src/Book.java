import java.util.ArrayList;

public class Book {
	private String title;
	
	private ArrayList<Author> authors = new ArrayList<>();
	ArrayList<Element> content = new ArrayList<>();
	
	public void print() {
		System.out.println("Book name: " + this.title+"\n");
		
		System.out.print("Book's authors: ");
		for(Author i : authors) {
			i.print();
		}
		
		for(Element i : content) {
			i.print();
		}
		
		
	}
	
	public Book(String title) {
		 this.title=title;
	}
	
	public void addAuthor (Author author) {
		this.authors.add(author);
		
	}
	
	public void addContent(Element element) {
		content.add(element);
	}
	
	
	
	

}
