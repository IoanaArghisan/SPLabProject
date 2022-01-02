
public class ImageProxy implements Element {
	
	private String name;
	Image realImage = null;
	
	public String getName() {
		return name;
	}

	public Image getRealImage() {
		return realImage;
	}

	public ImageProxy(String name) {
		this.name = name;
	}
	
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	public void render() {
		if(realImage == null) {
			realImage = new Image(this.name);
		}
		realImage.render();
	}

}
