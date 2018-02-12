import junit.framework.TestCase;

public class HelloWorldTest
    extends junit.framework.TestCase {
        HelloWorld hello = new HelloWorld();

    public HelloWorldTest() {}   //default constructor

    public void setUp() {  // creates a (simple) test fixture

        HelloWorld hello = new HelloWorld();
    }

    protected void tearDown() {}  //no resources to release

    public void testSayHello() {
          //assert(Hello!=null);
          assertEquals("Hello World",hello.sayHello());  }

      }


