
public class Table implements Element {
	public String name;
	
	public Table(String name) {
		this.name =name;
	}
	
	public void print() {
		System.out.println("Table with name: "+this.name);
	}

}
