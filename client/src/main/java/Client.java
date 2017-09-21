import lombok.extern.slf4j.Slf4j;
import org.eclipse.swt.internal.Library;

@Slf4j
public class Client {

  public static String GREETING = "Hello World";

  public static void main(String[] args) {
	  System.out.println("main");
	  log.info("main8");
          log.info(Libs01.add2(22,33));
  }

}

