import org.testng.annotations.*;

public class CheckingIsWorkMethodTest {
    @DataProvider
    public Object[][] parseValidData() {
        return new Object[][]{
                {1},
                {999},
        };
    }
    @DataProvider
    public Object[][] parseInvalidData() {
        return new Object[][]{
                {0},
                {-1},
        };
    }

    @Test(dataProvider = "parseValidData")
    public void testPenWorkability(int inkContainerValue) {
        Pen pen = new Pen(inkContainerValue);
        assert (pen.isWork());
    }
    @Test(dataProvider = "parseInvalidData")
    public void testPenWorkInability(int inkContainerValue) {
        Pen pen = new Pen(inkContainerValue);
        assert !(pen.isWork());
    }
}