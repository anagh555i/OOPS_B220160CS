package newshelfbonus;

public record Fiction<T>(T name,FictionType type) implements IBook<T>{
    public int compareTo(IBook b){
        return ((String)(this.name)).compareTo((String)(((Fiction)b).name));
    }
}