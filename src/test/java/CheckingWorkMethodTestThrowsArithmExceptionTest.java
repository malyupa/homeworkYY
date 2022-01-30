import org.testng.annotations.*;

public class CheckingWorkMethodTestThrowsArithmExceptionTest {
    @DataProvider
    public Object[][] parseValidDataException() {
        return new Object[][]{
                {"Comp", 4, 0},
                {"", 0, 0},
        };
    }
    @Test(dataProvider = "parseValidDataException", expectedExceptions = ArithmeticException.class)
    public void testExpectedArithmeticException(String word, int inkContainerValue, double sizeLetter) {
        Pen pen = new Pen(inkContainerValue, sizeLetter);
        double partOfWord = inkContainerValue/sizeLetter;
    }
}
