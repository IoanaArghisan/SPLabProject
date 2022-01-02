
public interface Visitor {
	
	void visit(Section s);
	void visit(Paragraph p);
	void visit(Image i);
	void visit(ImageProxy ip);
	void visit(Book b);
	void visit(Table t);
	void visit(TableOfContents toc);
	
}
