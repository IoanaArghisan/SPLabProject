
public class ImageProxy implements Element {
	
	private String name;
	Image dimension = null;
	
	public ImageProxy(String name) {
		this.name = name;
	}
	
	public void print() {
		if(dimension == null) {
			dimension = new Image(this.name);
		}
		dimension.print();
	}

}
