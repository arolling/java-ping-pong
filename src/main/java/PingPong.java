import java.io.Console;
import java.util.ArrayList;

public class PingPong {
  public static void main(String[] args) {

  }
  public ArrayList<Object> pingPongReplacer(Integer limit) {
    ArrayList<Object> pingPongList = new ArrayList<Object>();
    for (Integer index = 1 ; index <= limit; index ++) {
      if (index % 5 == 0) {
        pingPongList.add("pong");
      } else if (index % 3 == 0) {
        pingPongList.add("ping");
      } else {
        pingPongList.add(index);
      }
    }
    return pingPongList;
  }
}
