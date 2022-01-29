import org.testng.annotations.*;
import static org.testng.Assert.*;

public class CheckingInkAmountAfterTypingTest{
    @DataProvider
    public Object[][] parseValidData() {
        return new Object[][]{
                {"Cat", 5, 1.0},
                {"Horse", 1, 0.5},
                {"The mouse", 7, 0},
                {"", 10, 2.5},
        };
    }

    @Test(dataProvider = "parseValidData")
    public void testInkAmountAfterTyping(String word, int inkContainerValue, double sizeLetter) {
        Pen pen = new Pen(inkContainerValue, sizeLetter);
        int expected = (int) (inkContainerValue - (sizeLetter*word.length()));
        pen.write(word);
        int actual = pen.inkContainerValue;
        assertEquals(actual, expected);
    }
}
