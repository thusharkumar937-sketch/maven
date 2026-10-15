import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    App obj = new App();
    @Test
    public void testSimpleInterest1() {

        assertEquals(1000.0,
                     obj.simpleInterest(10000, 5, 2), 0.001);
    }
    @Test
    public void testSimpleInterest2() {
        assertEquals(500.0,
                     obj.simpleInterest(5000, 5, 2), 0.001);
    }
    @Test
    public void testSimpleInterest3() {

        assertEquals(0.0,
                     obj.simpleInterest(1000, 0, 2), 0.001);
    }
    @Test
    public void testSimpleInterest4() {
        assertEquals(200.0,
                     obj.simpleInterest(2000, 5, 2), 0.001);
    }
}