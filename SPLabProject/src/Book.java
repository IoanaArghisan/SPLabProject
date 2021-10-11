import java.util.ArrayList;

public class Book {
	private String title;
	
	private ArrayList<String> paragraphs = new ArrayList<>();
	private ArrayList<String> tabels = new ArrayList<>();
	private ArrayList<String> images = new ArrayList<>();
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	Book(String title){
        this.title=title;
    }
	
	public void createNewParagraph (String name) {
		paragraphs.add(name);
		
	}
	
	public void createNewTable (String name) {
		tabels.add(name);
		
	}
	
	public void createNewImage (String name) {
		images.add(name);
		
	}
	
	public void print() {
		System.out.println("Book name: " + this.title);
		printParagraph();
		printTables();
		printImage();
	}
	
	private void printParagraph(){
        for(String i: paragraphs)
        {
        	System.out.println(i);
          
        }
    }
	private void printTables(){
        for(String i: tabels)
        {
        	System.out.println(i);
          
        }
    }
	private void printImage(){
        for(String i: images)
        {
        	System.out.println(i);
          
        }
    }
}
