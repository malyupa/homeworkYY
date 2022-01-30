import org.testng.annotations.*;

public class CheckingWriteMethodTest {
    @DataProvider
    public Object[][] parseValidData() {
        return new Object[][]{
                {"Horse", 0, 25}, //empty word
                {"Flowers", -1, -5.5}, // empty word
                {"Driver", 1, 1.0}, // D
                {"Comp", 4, 1.0}, // Comp
                {"Television", 15, 0.1}, // Television
                {"b", 1, 0.25}, // b
                {"A book with images", 7, 0.75}, // A book wi
                {"Dog", 300, 110.1}, // Do
        };
    }
    @Test(dataProvider = "parseValidData")
    public void testReturnsCorrectWord(String word, int inkContainerValue, double sizeLetter) {
        Pen pen = new Pen(inkContainerValue, sizeLetter);
        String actual;
        int end = (int)(inkContainerValue/sizeLetter);
        if (inkContainerValue <= 0) {
            actual = "";
        } else if (end < word.length()) {
            actual = word.substring(0, end);
        } else {
            actual = word;
        }
        assert pen.write(word).equals(actual);
    }
}

