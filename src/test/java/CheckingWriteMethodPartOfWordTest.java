import org.testng.annotations.*;

import static org.testng.Assert.*;

public class CheckingWriteMethodPartOfWordTest {
    @DataProvider
    public Object[][] parseValidData() {
        return new Object[][]{
                {"Dog", 3, 1.1},
                {"Driver", 1, 1.0},
                {"A book with images", 7, 0.75}
        };
    }

    @Test(dataProvider = "parseValidData")
    public void testWritePartOfWord(String word, int inkContainerValue, double sizeLetter) {
        Pen pen = new Pen(inkContainerValue, sizeLetter);
        double end = (inkContainerValue/sizeLetter);
        String expected = word.substring(0, (int)end);
        String actual = pen.write(word);
        assertEquals(actual, expected);
    }
}
