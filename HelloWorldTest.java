
import org.junit.Test;
import static org.junit.Assert.*;


public class HelloWorldTest {

  @Test

    public void testMain() { 

      String[] expected = new String[] {
        "Yeah! This is a simple", "Hello World!!" };
      String[] results =
          AbstractMainTests.executeMain("HelloWorld", new String[] {"Yeah"});

          assertArrayEquals(expected, results);
            }

          }




