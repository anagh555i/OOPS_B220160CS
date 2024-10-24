package oldshelf;


public class Fiction extends Book {

	// /* TODO: Add most strict modifiers here*/ String name;
	private String name;
	// TODO: change 
	/**
	 * type is  a per instance object and it is initialized only once.
	 * 
	 */
	private final FictionType type; // type is not static and is final;
	public Fiction(String title,FictionType type) {
		this.name=title;
		this.type=type;
		// TODO  correct the above.
	}

	@Override
	public String toString(){
		return "Fiction[name:"+name+"]";
	}

	public String getName(){
		return this.name;
	}

}
