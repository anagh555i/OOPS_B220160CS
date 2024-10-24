package newshelf;

public sealed interface IBook permits Comic,Fiction,TextBook{
    // just so that records can implement it 
    // only Comic, Fiction and TextBook classes can implement IBook interface now
}