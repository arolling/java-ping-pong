import java.io.Console;
import java.util.ArrayList;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;


public class PingPong {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/pingpong", (request, response) -> {
      HashMap model = new HashMap();

      model.put("template", "templates/pingpong.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("pingpongresult", (request, response) -> {
      HashMap model = new HashMap();
      String stringLimit = request.queryParams("limitInput");
      Integer intLimit = Integer.parseInt(stringLimit);
      ArrayList<Object> pingPongedList = new ArrayList<Object>();
      pingPongedList = PingPong.pingPongReplacer(intLimit);
      String outputPing = PingPong.pingPongPrintout(pingPongedList);
      model.put("result", outputPing);
      model.put("template", "templates/pingpongresult.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

  }
  public static ArrayList<Object> pingPongReplacer(Integer limit) {
    ArrayList<Object> pingPongList = new ArrayList<Object>();
    for (Integer index = 1 ; index <= limit; index ++) {
      if (index % 5 == 0 && index % 3 == 0) {
        pingPongList.add("ping-pong");
      } else if (index % 5 == 0) {
        pingPongList.add("pong");
      } else if (index % 3 == 0) {
        pingPongList.add("ping");
      } else {
        pingPongList.add(index);
      }
    }
    return pingPongList;
  }

  public static String pingPongPrintout(ArrayList<Object> pingArray) {
    String prettyResult = "";
    for (Integer i = 0 ; i < pingArray.size() ; i++) {
      prettyResult += "<li>" + pingArray.get(i) + "</li>";
    }
    return prettyResult;
  }
}
