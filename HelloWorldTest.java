import org.junit.framework.TestCase;
import static org.junit.assertEquals;

public class HelloWorldTest  {

  @Test
        //HelloWorld hello = new HelloWorld();

    public void HelloWorldTest() { 

      HelloWorld hello = new HelloWorld();

      assertEquals("Hello World",hello.sayHello());  }

      }


