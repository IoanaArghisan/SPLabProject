import java.util.ArrayList;

public class Book {
	private String title;
	
	private ArrayList<Author> authors = new ArrayList<>();
	private ArrayList<Element> content = new ArrayList<>();
	
	
	public Book(String title) {
		 this.title=title;
	}
	
	public void addAuthor (Author author) {
		this.authors.add(author);
		
	}
	
	public void addContent(Element element) {
		content.add(element);
	}
	
	public void render() {
		System.out.println("Book name: " + this.title+"\n");
		
		System.out.print("Book's authors: ");
		for(Author i : authors) {
			i.render();
		}
		
		for(Element i : content) {
			i.render();
		}
		
		
	}
	
	public String getTitle() {
		return title;
	}

	public ArrayList<Author> getAuthors() {
		return authors;
	}

	public ArrayList<Element> getContent() {
		return content;
	}

	public void accept(Visitor visitor) {
		visitor.visit(this);
		for (Element i:content) {
			i.accept(visitor);
		}
	}
	
	
	

}
