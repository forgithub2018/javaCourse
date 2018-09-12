import org.junit.Test;
import static org.junit.Assert.*;


public class CalculatorTest {
    @Test
    public void testSum() {
        // prepare
        Calculator calculator = new Calculator();
        int expected = 25;

        // when
        int actual = calculator.sum(10, 15);

        // then
        assertEquals(expected, actual);
        // }
    }
}
