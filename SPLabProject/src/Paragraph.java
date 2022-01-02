
public class Paragraph implements Element {
	private String name;
	private AlignStrategy alignStrategy;
	
	public Paragraph(String name) {
		this.name = name;
	}
	
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	public void render() {
		if(alignStrategy == null) {
			System.out.println(this.name);
		}else {
			alignStrategy.render(this.name);
		}
	}
	
	public void setAlignStrategy(AlignStrategy alignStrategy) {
		this.alignStrategy = alignStrategy;
	}

	public String getName() {
		return name;
	}

	public AlignStrategy getAlignStrategy() {
		return alignStrategy;
	}

}
