package oldshelf;

public class Comic extends Book {

	// /* TODO: Add most strict modifiers here*/ String Title;
	private String Title;

	// TODO: Warning to be removed.
	private  int ageOfMainCharacter;

	// TODO Correct the error
	public Comic(String Title, int ageOfMainCharacter) {
		this.Title=Title;
		this.ageOfMainCharacter=ageOfMainCharacter;
	}
	
	// TODO : create a getter if required.
	public String getTitle(){
		return this.Title;
	}
	
	// TODO: Create a setter if required
	public void setTitle(String Title){
		this.Title=Title;
	}

	// TODO: write a toString method
	@Override
	public String toString() {
		return "Comic[Title:"+Title+" Age of main character="+ageOfMainCharacter+"]";
	}

	// TODO: Bonus: 
	@Override
	public int hashCode() {
		// TODO: Fill up an arbitrary hash method that takes into account only the age of main characted and the Strign title
		return Title.hashCode()+ageOfMainCharacter;
	}
	
	// TODO: Bonus: 
	@Override
	public boolean equals(Object o) {
		if(o instanceof Comic){
			if(this.hashCode()==((Comic)(o)).hashCode())return true;
		}
		return false;
		// TODO: Based on the information about hashCode write the equals method.
	}
}
