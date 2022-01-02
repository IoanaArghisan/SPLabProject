
public class TableOfContents implements Element {
	public String tableOc;
	
	public TableOfContents(String tableOc) {
		this.tableOc = tableOc;
	}
	
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	public void render() {
		System.out.print("Table of contents: ");
		System.out.println(tableOc);
	}

}
