import java.util.ArrayList;

public class Chapter {
	private String name;
	
	private ArrayList<Section> subChapters = new ArrayList<>();
	
	public Chapter(String name) {
		this.name = name;
	}
	

	public int createSubChapter(String name) {
		Section sub = new Section(name);
		subChapters.add(sub);
		return subChapters.indexOf(sub);
	}
	
	public Section getSubChapter(int index) {
		return subChapters.get(index);
	}
	
	public void print() {
		System.out.println("Chapter name is "+this.name);
	}

}
