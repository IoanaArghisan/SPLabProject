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
	
	public String getTitle() {
		return title;
	}

	public ArrayList<Element> getElements() {
		return elements;
	}

	public Element getElement(int index) {
		 return elements.get(index);
	}
	
	private void printElements() {
		for(Element i : this.elements)
		{
			i.render();
		}
	}
	
	public void accept(Visitor visitor) {
		visitor.visit(this);
		for(Element i:elements) {
			i.accept(visitor);
		}
	}
	
	public void render() {
		System.out.println(title);
		printElements();
			
	}

}
