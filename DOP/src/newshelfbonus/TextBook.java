package newshelfbonus;

public record TextBook<T>(T subject) implements IBook<T>{
    public int compareTo(IBook b){
        return ((String)(this.subject)).compareTo((String)(((TextBook)b).subject));
    }
}