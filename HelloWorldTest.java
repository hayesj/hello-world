
import org.junit.Test;
import static org.junit.Assert.*;


public class HelloWorldTest {

  @Test
  public void evaluateExpression() { 


      HelloWorld hello = new HelloWorld();
      int sum = hello.evaluate("1+2+3");
      assertEquals(6, sum);

    }

     // String[] expected = new String[] {
     //   "Yeah! This is a simple", "Hello World!!" };
     // String[] results =
     //     AbstractMainTests.executeMain("HelloWorld", new String[] {"Yeah"});

      //    assertArrayEquals(expected, results);
       //     }

          }




