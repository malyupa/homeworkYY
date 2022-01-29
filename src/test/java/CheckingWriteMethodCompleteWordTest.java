import org.testng.annotations.*;
import static org.testng.Assert.*;


public class CheckingWriteMethodCompleteWordTest {
    @DataProvider
    public Object[][] parseValidData() {
        return new Object[][]{
                {"Comp", 4, 1.0},
                {"Television", 15, 0.3},
                {"b", 1, 0.25},
        };
    }

    @Test(dataProvider = "parseValidData")
    public void testWriteCompleteWord(String word, int inkContainerValue, double sizeLetter) {
        Pen pen = new Pen(inkContainerValue, sizeLetter);
        String actual = pen.write(word);
        assertEquals(actual, word);
    }
}
