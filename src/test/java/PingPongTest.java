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
    assertEquals(testArray, arrayTest.pingPongReplacer(2));
  }

  @Test
  public void pingPongReplacer_replacesMultiplesOfThree_WithPing() {
    PingPong arrayTest = new PingPong();
    ArrayList<Object> testArray = new ArrayList<Object>();
    testArray.add(1);
    testArray.add(2);
    testArray.add("ping");
    assertEquals(testArray, arrayTest.pingPongReplacer(3));
  }

  @Test
  public void pingPongReplacer_replacesMultiplesOfFive_WithPong() {
    PingPong arrayTest = new PingPong();
    ArrayList<Object> testArray = new ArrayList<Object>();
    testArray.add(1);
    testArray.add(2);
    testArray.add("ping");
    testArray.add(4);
    testArray.add("pong");
    assertEquals(testArray, arrayTest.pingPongReplacer(5));
  }
}
