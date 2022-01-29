import org.testng.annotations.*;
import static org.testng.Assert.*;

public class CheckingDoSomethingElseMethodTest {
    @DataProvider
    public Object[][] parseValidData() {
        return new Object[][]{
                {5, 1.0, "RED"},
                {1, 0.5, "GREEN"},
                {7, 0, ""},
        };
    }
    @Test(dataProvider = "parseValidData")
    public void testNotNullResult(int inkContainerValue, double sizeLetter, String color) {
        Pen pen = new Pen(inkContainerValue, sizeLetter, color);
        assertNotNull(pen.doSomethingElse());
    }
}
