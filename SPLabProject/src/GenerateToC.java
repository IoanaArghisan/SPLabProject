
public class GenerateToC implements Visitor {

	TableOfContents tableOfContents;
	
	public void visit(Book b) {
		String book="";
		book +=b.getTitle();
		book += "\n";
		for(Author i : b.getAuthors()) {
			book+=i;
			book+=" ,";
		}
		book+="\n";
		for(Element i : b.getContent()) {
			book+=i;
			book+=" ,";
		}
		book+="\n";
		
		tableOfContents.tableOc=book;
		
	}
	
	public void visit(Section s) {
		String section="";
		section +=s.getTitle();
		section += "\n";
		for(Element i : s.getElements()) {
			section+=i;
			section+=" ,";
		}
		section+="\n";
		
		tableOfContents.tableOc=section;
		
	}
	
	public void visit(Paragraph p) {
		tableOfContents.tableOc=p.getName();
		
		
	}
	
	public void visit(Image i) {
		tableOfContents.tableOc=i.getImageName();
		
	}
	
	public void visit(ImageProxy ip) {
		tableOfContents.tableOc=ip.getName();
		
	}
	
	public void visit(Table t) {
		tableOfContents.tableOc=t.name;
		
	}
	
	
	public GenerateToC(TableOfContents tableOc) {
		this.tableOfContents= tableOc;
		
	}

	public TableOfContents getToC() {
		return tableOfContents;
	}

	@Override
	public void visit(TableOfContents toc) {
		tableOfContents.tableOc=toc.tableOc;
		
	}

}
