// package oldshelf;
import org.junit.*;
import static org.junit.Assert.*;
// import static org.junit.jupiter.api.Assertions.assertEquals;

public class OldSelectionTest {
    @Test 
    public void test(){
        TextBook t = new TextBook("Mathematics");
        assertEquals("Mathematics",OldSelection.getAgeOrTitle(t));

		Fiction f= new Fiction("Marathon man",FictionType.Comedy);
        assertEquals("Marathon man",OldSelection.getAgeOrTitle(f));

		Comic c= new Comic("Iron man",36);
        assertEquals("Iron man",OldSelection.getAgeOrTitle(c));
        
        // assertEquals("wrong case", OldSelection.getAgeOrTitle("Sending wrong object(String)"));
    }
}
