import org.testng.annotations.*;

public class CheckingWriteMethodEmptyInkTest {
    @DataProvider
    public Object[][] parseValidData() {
        return new Object[][]{
                {"Horse", 0},
                {"Dog", -1},
        };
    }

    @DataProvider
    public Object[][] parseInvalidData() {
        return new Object[][]{
                {"H", 1},
                {"Life", 5},
        };
    }
    @Test(dataProvider = "parseValidData")
    public void testReturnsEmptyWord(String word, int inkContainerValue) {
        Pen pen = new Pen(inkContainerValue);
        assert pen.write(word).equals("");
    }

    @Test(dataProvider = "parseInvalidData")
    public void testReturnsNotEmptyWord(String word, int inkContainerValue) {
        Pen pen = new Pen(inkContainerValue);
        assert !(pen.write(word).equals(""));
    }
}