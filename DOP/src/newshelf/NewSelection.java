package newshelf;


public class NewSelection {

	// TODO: Complete this method 
	/**
	 * 
	 * @param o object
	 * returns if o is not a book, returns empty string, if Comic, returns title, of Fiction
	 * returns name, and if TextBook, returns subject.
	 */
	public static String getAgeOrTitle(Object o) {
		
		if (o instanceof IBook) {
			return switch (o) {
				case Comic(String title,int age) -> title;
				case Fiction(String name,FictionType type) -> name;
				case TextBook(String subject) -> subject;
				default -> null;
			};		

			// return switch (o) {
			// 	case Comic c -> c.Title();
			// 	case Fiction f -> f.name();
			// 	case TextBook t -> t.subject();
			// 	default -> null;
			// };

			// if(o instanceof Comic) return ((Comic)o).Title();
			// if(o instanceof Fiction) return ((Fiction)o).name();
			// if(o instanceof TextBook) return ((TextBook)o).subject();
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
