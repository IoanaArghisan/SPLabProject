
public class Author {
	private String name;
	
	Author(String name){
		this.name = name;
	}
	
	public void render() {
		System.out.println("\n"+"Author: "+this.name+"\n");
	}

}
