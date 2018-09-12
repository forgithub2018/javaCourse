import org.junit.Test;
import static org.junit.Assert.*;

public class AraayStackTest {
@Test
    public void pushTest(){

    Stack stack = new ArrayStack();
    stack.push("A");

    Object expectedValue = "A";
    Object actualValue = ((ArrayStack) stack).array[0];
    assertEquals(expectedValue,actualValue);

}
}
