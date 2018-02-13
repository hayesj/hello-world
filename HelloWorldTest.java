import junit.framework.TestCase;

public class HelloWorldTest extends junit.framework.TestCase  {

  @Test
        //HelloWorld hello = new HelloWorld();

    public void HelloWorldTest() { 

      HelloWorld hello = new HelloWorld();

      assertEquals("Hello World",hello.sayHello());  }

      }


