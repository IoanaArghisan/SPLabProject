
public class BookStatistics implements Visitor{

	int book = 0;
	int paragraphs = 0;
	int sections = 0;
	int imageProxy = 0;
	int images = 0;
	int tables = 0;
	int tablesOC = 0;
	
	public void visit(Book b) {
		book++;
	}
	
	public void visit(Section s) {
		sections++;
	}
	
	public void visit(Paragraph p) {
		paragraphs++;
	}
	
	public void visit(Image i) {
		images++;
	}
	
	public void visit(ImageProxy ip) {
		imageProxy++;
	}
	
	public void visit(Table t) {
		tables++;
	}
	
	public void visit(TableOfContents toc) {
		tablesOC++;
	}
	public void printStatistics() {
		System.out.println("Books: "+book+"\nSections: "+sections+"\nParagraphs: "+paragraphs+"\nImages: "+images+"\nImageProxy: "+imageProxy+"\nTables: "+tables+"\n");
	}

}
