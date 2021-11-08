import java.util.ArrayList;

public class Section implements Element {
	private String title;
	
	private ArrayList<Element> elements = new ArrayList<>();
	
	public Section(String title) {
		this.title = title;
	}
	
	public void add(Element element) {
		elements.add(element);
		elements.indexOf(element);
	}
	
	public void remove(Element element) {
		elements.remove(element);
	}
	
	public Element getElement(int index) {
		 return elements.get(index);
	}
	
	private void printElements() {
		for(Element i : this.elements)
		{
			i.print();
		}
	}
	
	
	
	public void print() {
		System.out.println(title);
		printElements();
			
	}

}
