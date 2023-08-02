package Class.SubClass;

import Class.ClassSuper.Common;

public class Path extends Common{

	private String link;
	
	public Path() {
		
	}
	
	public Path(String link) {
		this.link = link;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}
}
