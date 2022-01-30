/*import org.testng.annotations.*;
import static org.testng.Assert.*;

public class CheckingInkAmountAfterTypingTest {
    @DataProvider
    public Object[][] parseValidData() {
        return new Object[][]{
                {"Cat", 5, 1.0},
                {"Horse", 1, 0.5},
                {"The mouse", 1000, 0},
                {"", 100, 2.3},
                {"Nice", 10, 2.5},
        };
    }

    @Test(dataProvider = "parseValidData")
    public void testInkAmountAfterTyping(String word, int inkContainerValue, double sizeLetter) {
        Pen pen = new Pen(inkContainerValue, sizeLetter);
        int expected = (int) (inkContainerValue - (sizeLetter * word.length()));
        if (expected < 0) {
            expected = 0;
        }
        pen.write(word);
        int actual = pen.inkContainerValue;
        assertEquals(expected, actual);
    }
}*/
