
// package oldshelf;

public class OldSelection {

	// TODO: Complete this method.
	/**
	 * 
	 * @param o object
	 * returns if o is not a book, returns empty string, if Comic, returns title, of Fiction
	 * returns name, and if TextBook, returns subject.
	 */
	public static String getAgeOrTitle(Object o) {
		
		if (o instanceof Book) {
			switch(o.getClass().getName()){
				case "Comic": return ((Comic)o).getTitle();
				case "Fiction" : return ((Fiction)o).getName();
				case "TextBook" : return ((TextBook)o).getSubject();
			}
			// if(o instanceof Comic) return ((Comic)o).getTitle();
			// if(o instanceof Fiction) return ((Fiction)o).getName();
			// if(o instanceof TextBook) return ((TextBook)o).getSubject();
		}
		return null;
	}

	public static void main(String[] args) {
		
		// TODO: Write a test code here and execute and text.
		TextBook t = new TextBook("Mathematics");
		System.out.println(getAgeOrTitle(t));

		Fiction f= new Fiction("Marathon man",FictionType.Comedy);
		System.out.println(getAgeOrTitle(f));

		Comic c= new Comic("Iron man",36);
		System.out.println(getAgeOrTitle(c));

		System.out.println(getAgeOrTitle("String object"));

		System.out.println(t);
		System.out.println(f);
		System.out.println(c);
	}
}
