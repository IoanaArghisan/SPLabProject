
public class Table implements Element {
	public String name;
	
	public Table(String name) {
		this.name =name;
	}
	
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	public void render() {
		System.out.println("Table with name: "+this.name);
	}

}
