
public class RenderContentVisitor implements Visitor{

	public void visit(Book b) {
		b.render();
	}
	
	public void visit(Section s) {
		s.render();
	}
	
	public void visit(Paragraph p) {
		p.render();
	}
	
	public void visit(Image i) {
		i.render();
	}
	
	public void visit(ImageProxy ip) {
		ip.render();
	}
	
	public void visit(Table t) {
		t.render();
	}
	
	public void visit(TableOfContents toc) {
		toc.render();
	}
}
