import org.testng.annotations.*;

public class CheckingGetColorMethodTest {

    @Test
    @Parameters({ "inkContainerValue", "sizeLetter", "color" })
    public void testColor(int inkContainerValue, double sizeLetter, String color) {
        Pen pen = new Pen(inkContainerValue, sizeLetter, color);
        assert(pen.getColor()).equals(color);
    }
}
