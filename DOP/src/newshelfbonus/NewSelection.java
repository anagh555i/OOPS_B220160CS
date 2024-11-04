package newshelfbonus;


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
		TextBook<String> t1 = new TextBook("Mathematics");
		System.out.println(getAgeOrTitle(t1));

		Fiction<String> f1= new Fiction("Marathon man",FictionType.Comedy);
		System.out.println(getAgeOrTitle(f1));

		Comic<String> c1= new Comic("Iron man",36);
		System.out.println(getAgeOrTitle(c1));

		System.out.println(getAgeOrTitle("String object"));

		System.out.println(t1);
		System.out.println(f1);
		System.out.println(c1);

		// using compareTo 
		Comic<String> c2= new Comic("Spiderman",22);
		System.out.println(c1.compareTo(c2));

		TextBook<String> t2 = new TextBook("Physics");
		System.out.println(t1.compareTo(t2));

		Fiction<String> f2= new Fiction("Physco tommy",FictionType.Comedy);
		System.out.println(f1.compareTo(f2));
	}
}
