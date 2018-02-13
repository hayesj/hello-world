import junit.framework.TestCase;
import org.junit.Test;

public class HelloWorldTest extends junit.framework.TestCase  {

  @Test
        //HelloWorld hello = new HelloWorld();

    public void HelloWorldTest() { 

      HelloWorld hello = new HelloWorld();

      hello.sayHello();  // print out hello World

      //assertEquals("Hello World",hello.sayHello);  
    }

      }


