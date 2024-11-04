package newshelfbonus;

public record Comic<T>(T Title,int ageOfMainCharacter) implements IBook<T> {
    public int compareTo(IBook b){
        return ((String)(this.Title)).compareTo((String)(((Comic)b).Title));
    }
}