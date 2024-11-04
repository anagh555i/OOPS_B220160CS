package oldshelf;
import java.util.*;

public class TextBook extends Book {

	// TODO: Make this a final field with most strict visiibility possible.
	private final String subject;
	
	// TODO: Change the constructor if required? Correct any errors
	public TextBook(String subject) {
		// super(subject);
		this.subject=subject;
	}

	// TODO : create a getter if required.
	public String getSubject(){
		return this.subject;
	}
	
	// TODO: Create a setter if required
	// setter is not required
	
	// TODO: write a toString method
	@Override
	public String toString() {
		return "TextBook[Subject:"+subject+"]";
	}

	@Override
	public boolean equals(Object o){
		if(this == o ) return true;
		if(o==null || this.getClass() != o.getClass()) return false;
		return this.subject==((TextBook)o).getSubject();
	}

	@Override
	public int hashCode(){
		return Objects.hash(subject);
	}

}


// javap -p -v -c TextBook.class