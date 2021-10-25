import java.util.ArrayList;

public class SubChapter {
	private String name;
	
	private ArrayList<Element> elements = new ArrayList<>();
	
	public SubChapter(String name) {
		this.name = name;
	}
	
	
	
	public void createNewParagraph (String name) {
		elements.add(new Paragraph(name));
		
	}
	
	public void createNewImage (String imageName) {
		elements.add(new Image(imageName));
		
	}
	
	public void createNewTable (String name) {
		elements.add(new Table(name));
		
	}
	
	private void printElements() {
		for(Element i : this.elements)
		{
			i.print();
		}
	}
	
	
	
	public void print() {
		System.out.println("Subchapter: "+this.name);
		printElements();
			
	}

}
