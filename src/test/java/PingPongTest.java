import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class PingPongTest {

  @Test
  public void pingPongReplacer_returnsArrayListOfNumbers_OneToX() {
    PingPong arrayTest = new PingPong();
    ArrayList<Object> testArray = new ArrayList<Object>();
    testArray.add(1);
    testArray.add(2);
    testArray.add(3);
    assertEquals(testArray, arrayTest.pingPongReplacer(3));
  }
}
