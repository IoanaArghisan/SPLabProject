import java.util.concurrent.TimeUnit;

public class Image implements Element {
	private String imageName;
	

	public String getImageName() {
		return imageName;
	}

	public Image(String name){
		imageName = name;
		try {
			TimeUnit.SECONDS.sleep(5);
		}catch (InterruptedException e){
			e.printStackTrace();
		}
		
	}
	
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	public void render() {
		System.out.println("Image with name: "+this.imageName);
	}

}
